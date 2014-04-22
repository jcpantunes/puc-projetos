package puc.pf.portal.rest;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import puc.pf.portal.business.AlunoBC;
import puc.pf.portal.dto.AlunoDTO;

@Path("serviceportalrest")
@Produces(MediaType.APPLICATION_XML)
public class RestServicePortal {
	
	@GET
	@Path("/")
	@Produces(MediaType.TEXT_PLAIN)
	public String principal() {
    	return "Web Services desenvolvido para seminario sobre JAX-RS " +
    			"Consultas Disponiveis: " +
    			"http://localhost:8080/portal-servicos/serviceportalrest/consultarListaAluno/" +
    			"http://localhost:8080/portal-servicos/serviceportalrest/consultarAluno/100" +
    			"http://localhost:8080/portal-servicos/serviceportalrest/consultarListaTarefa/" +
    			"http://localhost:8080/portal-servicos/serviceportalrest/consultarTarefa/100" +
    			"http://localhost:8080/portal-servicos/serviceportalrest/consultarTarefasAluno/";
    }
    
	@GET
	@Path("consultarListaAluno/")
	@Produces(MediaType.APPLICATION_JSON)
	public List<AlunoDTO> consultarListaAluno() {
    	AlunoBC bc = new AlunoBC();
    	return AlunoDTO.parserFromAluno(bc.findAll());
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
