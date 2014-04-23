package puc.pf.portal.util;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Iterator;
import java.util.Map;

import javax.faces.FacesException;
import javax.faces.application.FacesMessage;
import javax.faces.application.NavigationHandler;
import javax.faces.context.ExceptionHandler;
import javax.faces.context.ExceptionHandlerWrapper;
import javax.faces.context.FacesContext;
import javax.faces.event.ExceptionQueuedEvent;
import javax.faces.event.ExceptionQueuedEventContext;
import javax.inject.Inject;

import puc.pf.portal.business.ExcecaoCapturadaBC;
import puc.pf.portal.domain.ExcecaoCapturada;
import puc.pf.portal.view.IndexMB;
import puc.pf.portal.view.ManterExcecaoCapturadaMB;

//Inicialmente devemos implementar a classe CustomExceptionHandler que extende a classe ExceptionHandlerWrapper
public class CustomExceptionHandler extends ExceptionHandlerWrapper {

	@Inject
	private ExcecaoCapturadaBC excecaoCapturadaBC;

	private ExceptionHandler wrapped;

	// Obtém uma instância do FacesContext
	final FacesContext facesContext = FacesContext.getCurrentInstance();

	// Obtém um mapa do FacesContext
	final Map<String, Object> requestMap = facesContext.getExternalContext()
			.getRequestMap();

	// Obtém o estado atual da navegação entre páginas do JSF
	final NavigationHandler navigationHandler = facesContext.getApplication()
			.getNavigationHandler();

	// Declara o construtor que recebe uma exceptio do tipo ExceptionHandler
	// como parâmetro
	CustomExceptionHandler(ExceptionHandler exception) {
		this.wrapped = exception;
	}

	// Sobrescreve o método ExceptionHandler que retorna a "pilha" de exceções
	@Override
	public ExceptionHandler getWrapped() {
		return wrapped;
	}

	// Sobrescreve o método handle que é responsável por manipular as exceções
	// do JSF
	@Override
	public void handle() throws FacesException {

		final Iterator<ExceptionQueuedEvent> iterator = getUnhandledExceptionQueuedEvents()
				.iterator();
		while (iterator.hasNext()) {
			ExceptionQueuedEvent event = (ExceptionQueuedEvent) iterator.next();
			ExceptionQueuedEventContext context = (ExceptionQueuedEventContext) event
					.getSource();

			// Recupera a exceção do contexto
			Throwable exception = context.getException();

			// Aqui tentamos tratar a exeção
			try {

				StringWriter stringWriter = new StringWriter();
				PrintWriter printWriter = new PrintWriter(stringWriter);
				exception.printStackTrace(printWriter);
				String stacktrace = stringWriter.toString();
				
				exception.printStackTrace();

				ExcecaoCapturada excecao = new ExcecaoCapturada();
				excecao.setTipoExcecao(exception.getClass().getName());
				excecao.setStacktrace(stacktrace);
				excecao.setTicket(ExcecaoCapturada.gerarTicket());
				excecao.setDataExcecao();
				
				ExcecaoCapturadaBC excecaoCapturadaBC = new ExcecaoCapturadaBC();
				excecaoCapturadaBC.inserirComFlush(excecao);

				// Coloca uma mensagem de exceção no mapa da request
				requestMap.put("exceptionMessage", exception.getMessage());

				// Avisa o usuário do erro
				FacesContext
						.getCurrentInstance()
						.addMessage(
								null,
								new FacesMessage(
										FacesMessage.SEVERITY_ERROR,
										"O sistema se recuperou de um erro inesperado.",
										""));

				// Seta a navegação para uma página padrão.
				navigationHandler.handleNavigation(facesContext, null,
						"/restrict/home.faces");

				// Renderiza a pagina de erro e exibe as mensagens
				facesContext.renderResponse();

			} finally {
				// Remove a exeção da fila
				iterator.remove();
			}
		}
		// Manipula o erro
		getWrapped().handle();
	}
}