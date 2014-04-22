package puc.pf.portal.rest;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import puc.pf.portal.business.AlunoBC;
import puc.pf.portal.business.ExcecaoCapturadaBC;
import puc.pf.portal.dto.AlunoDTO;
import puc.pf.portal.dto.ExcecaoCapturadaDTO;
import puc.pf.portal.util.Constantes;

@Path(Constantes.CONTEXTO_REST)
@Produces(MediaType.APPLICATION_XML)
public class RestServicePortal {
	//http://localhost:8080/portal-servicos/serviceportalrest/
	
	@GET
	@Path("/")
	@Produces(MediaType.TEXT_PLAIN)
	public String principal() {
    	return "Web Services desenvolvido para seminario sobre JAX-RS " +
    			"Consultas Disponiveis: " +
    			Constantes.URI + "/" + Constantes.CONTEXTO + "/" + Constantes.CONTEXTO_REST + "/consultarListaAluno/" +
    			Constantes.URI + "/" + Constantes.CONTEXTO + "/" + Constantes.CONTEXTO_REST + "/consultarAluno/100" +
    			Constantes.URI + "/" + Constantes.CONTEXTO + "/" + Constantes.CONTEXTO_REST + "/consultarListaExcecao";
    }
    
	@GET
	@Path(Constantes.OPERACAO_CONSULTAR_LISTA_ALUNO + "/")
	@Produces(MediaType.APPLICATION_JSON)
	public List<AlunoDTO> consultarListaAluno() {
    	AlunoBC bc = new AlunoBC();
    	return AlunoDTO.parserFromAluno(bc.findAll());
    }
	
	@GET
	@Path(Constantes.OPERACAO_CONSULTAR_LISTA_EXCECAO + "/")
	@Produces(MediaType.APPLICATION_JSON)
	public List<ExcecaoCapturadaDTO> consultarListaExcecao() {
		ExcecaoCapturadaBC bc = new ExcecaoCapturadaBC();
    	return ExcecaoCapturadaDTO.parserFromExcecao(bc.findAll());
    }
    
//    @GET
//	@Path("consultarAluno/{codigoAluno}")
//	@Produces(MediaType.APPLICATION_JSON)
//    public AlunoDTO consultarAluno(@PathParam("codigoAluno") final Integer codigoAluno) {
//    	AlunoDAO dao = new AlunoDAO();
//    	Aluno f = dao.listarPorCodigo(codigoAluno);
//    	if (f != null) {
//    		return AlunoDTO.parserFromAluno(f);
//    	}
//    	return (new AlunoDTO());
//    }
//    
//	@GET
//	@Path("consultarListaTarefa/")
//	public List<TarefaDTO> consultarListaTarefa() {
//    	TarefaDAO dao = new TarefaDAO();
//    	List<Tarefa> lista = dao.listar();
//    	return TarefaDTO.parserFromTarefa(lista);
//    }
//    
//    @GET
//	@Path("consultarTarefa/{codigoTarefa}")
//	public TarefaDTO consultarTarefa(@PathParam("codigoTarefa") final int codigoTarefa) {
//    	TarefaDAO dao = new TarefaDAO();
//    	Tarefa t = dao.listarPorCodigo(codigoTarefa);
//    	if (t != null) {
//    		return TarefaDTO.parserFromTarefa(t);
//    	}
//    	return (new TarefaDTO());
//	}
//    
//    @GET
//	@Path("consultarTarefasAluno/{codigoAluno}")
//	public List<TarefaDTO> consultarTarefasAluno(@PathParam("codigoAluno") Integer codigoAluno) {
//    	AlunoDAO dao = new AlunoDAO();
//    	Aluno f = dao.listarPorCodigo(codigoAluno);
//    	if (f != null) {
//    		return TarefaDTO.parserFromTarefa(f.getListaTarefa());
//    	}
//    	return new ArrayList<TarefaDTO>();	
//    }
	
	
}
