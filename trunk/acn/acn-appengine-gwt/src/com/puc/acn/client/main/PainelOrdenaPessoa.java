package com.puc.acn.client.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.KeyCodes;
import com.google.gwt.event.dom.client.KeyUpEvent;
import com.google.gwt.event.dom.client.KeyUpHandler;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.ScrollPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.puc.acn.client.AcnService;
import com.puc.acn.client.AcnServiceAsync;
import com.puc.acn.client.dominio.Pessoa;
import com.puc.acn.client.util.FieldVerifier;
import com.puc.acn.client.util.WidgetUtil;

public class PainelOrdenaPessoa extends VerticalPanel {
	
	/**
	 * Create a remote service proxy to talk to the server-side Greeting service.
	 */
	private final AcnServiceAsync acnService = GWT.create(AcnService.class);
	
	private FlexTable tabela = new FlexTable();
	
	public PainelOrdenaPessoa() {
		prepararWidget(new ArrayList<Pessoa>(), "0", "0", "0", "0", "0");
	}
	
	private void prepararWidget(final List<Pessoa> lista, String quantidade, String tempoTotal, String TempoInsert, String tempoSelect, String tempoProcessamento) {
		this.clear();
		this.setSize("800px", "400px");
	
		final Label lbl1 = new Label("Quantidade: ");
		final TextBox txtQuantidade = new TextBox();
		
		final Button btnProcessar = new Button("Processar");
		btnProcessar.addStyleName("sendButton");
		
		MyHandler handler = new MyHandler(btnProcessar, txtQuantidade);
		btnProcessar.addClickHandler(handler);
		
		final Button btnLimpar = new Button("Limpar");
		btnLimpar.addStyleName("sendButton");
		btnLimpar.addClickHandler(new ClickHandler() {
			@Override
			public void onClick(ClickEvent event) {
				prepararWidget(new ArrayList<Pessoa>(), "0", "0", "0", "0", "0");
			}
		});
		
		Label lblQuantidade = new Label(quantidade);
		Label lblTempoTotal = new Label(tempoTotal);
		Label lblTempoInsert = new Label(TempoInsert);
		Label lblTempoSelect = new Label(tempoSelect);
		Label lblTempoProcessamento = new Label(tempoProcessamento);
		
		this.setStyleName("gwt-BaseFlexTable");
        tabela = new FlexTable();
        tabela.setCellPadding(4);
        tabela.setCellSpacing(0);
        tabela.setBorderWidth(1);
        
        preencheTabela(lista);
        
        ScrollPanel spanel = new ScrollPanel(tabela);
        spanel.setSize("500px", "200px");
        
		this.add(WidgetUtil.criarPainelHorizontal(lbl1, txtQuantidade));
		this.add(WidgetUtil.criarPainelHorizontal(btnProcessar, btnLimpar));
		
		VerticalPanel vPanel = new VerticalPanel();
		vPanel.setWidth("200px");
		vPanel.add(WidgetUtil.criarPainelHorizontal(new Label("Quantidade de Registros =  "), lblQuantidade));
		vPanel.add(WidgetUtil.criarPainelHorizontal(new Label("Tempo Total =  "), lblTempoTotal));
		vPanel.add(WidgetUtil.criarPainelHorizontal(new Label("Tempo I/O de Insert =  "), lblTempoInsert));
		vPanel.add(WidgetUtil.criarPainelHorizontal(new Label("Tempo I/O de Select =  "), lblTempoSelect));
		vPanel.add(WidgetUtil.criarPainelHorizontal(new Label("Tempo de Processamento =  "), lblTempoProcessamento));
		
		HorizontalPanel hPanel = WidgetUtil.criarPainelHorizontal(vPanel, spanel);
		hPanel.setWidth("400px");
		
		this.add(hPanel);
	
	}
	
    private void preencheTabela(List<Pessoa> lista) {
        if(tabela != null) {
            tabela.clear();
        }
        
        for(int i = 0 ; i < tabela.getRowCount() ; i++) {
            tabela.removeRow(i);
        }
        
        Label lbl1 = new Label("Codigo");
        tabela.setWidget( 0, 0, lbl1);
        
        Label lbl2 = new Label("Nome");
        tabela.setWidget( 0, 1, lbl2);
        
        for(int i = 0 ; i < lista.size() ; i++ ) {
            Label lblCodigo = new Label(""+lista.get(i).getCodigo());
            tabela.setWidget( i + 1, 0, lblCodigo);
            Label lblNome = new Label(lista.get(i).getNome());
            tabela.setWidget( i + 1, 1, lblNome);
        }
    }
    
	class MyHandler implements ClickHandler, KeyUpHandler {
		
		private Button sendButton = null;
		private TextBox txt1 = null;
		
		public MyHandler(Button sendButton, TextBox txt1) {
			this.sendButton = sendButton;
			this.txt1 = txt1;
		}
		
		@Override
		public void onClick(ClickEvent event) {
			processarInformacao();
		}
		
		@Override
		public void onKeyUp(KeyUpEvent event) {
			if (event.getNativeKeyCode() == KeyCodes.KEY_ENTER) {
				processarInformacao();
			}
		}
		
		private void processarInformacao() {
			final ModalWaiting wait = new ModalWaiting();
			wait.show();
			wait.center();
			
			final long tempoInicio = System.currentTimeMillis();
			
			if (txt1.getText().isEmpty() || !FieldVerifier.isDigit(txt1.getText())) {
				ModalPanel modal = new ModalPanel(sendButton, "Listar os " + txt1.getText() + "registros", "Os valores digitados devem ser numeros");
				modal.center();
			}
			
			final Integer num1 = Integer.parseInt(txt1.getText());
			
			acnService.recuperarListaPessoa( num1,
				new AsyncCallback<Map<String, List<Pessoa>>>() {
					
					public void onFailure(Throwable caught) {
						wait.hide();
						ModalPanel modal = new ModalPanel(sendButton, "Tentativa de recuperar a Lista de Pessoas", caught.getMessage());
						modal.center();
					}

					public void onSuccess(Map<String, List<Pessoa>> result) {
						long tempoTotal = System.currentTimeMillis() - tempoInicio;
						wait.hide();
						Set<String> set = result.keySet();
				    	if (set.size() > 0) {
				    		String tempo = set.iterator().next();
				    		String array[] = tempo.split(":");
				    		List<Pessoa> lista = result.get(tempo);
				    		prepararWidget(lista, ""+lista.size(), ""+tempoTotal, array[0], array[1], array[2]);
				    	}
					}
				});
			
		}
	}
}
