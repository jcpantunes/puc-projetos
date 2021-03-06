package puc.pf.portal.rest;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import puc.pf.portal.business.ExcecaoCapturadaBC;
import puc.pf.portal.business.FuncionarioBC;
import puc.pf.portal.domain.Funcionario;
import puc.pf.portal.dto.ExcecaoDTO;
import puc.pf.portal.dto.FuncionarioDTO;
import puc.pf.portal.util.PortalConstantes;

@Path(PortalConstantes.CONTEXTO_REST)
@Produces(MediaType.APPLICATION_XML)
public class RestServicePortal {
	//http://localhost:8080/portal-servicos/serviceportalrest/
	
	@GET
	@Path("/")
	@Produces(MediaType.TEXT_PLAIN)
	public String principal() {
    	return "Web Services desenvolvido para seminario sobre JAX-RS " +
    			"Consultas Disponiveis: " +
    			PortalConstantes.URI + "/" + PortalConstantes.CONTEXTO + "/" + PortalConstantes.CONTEXTO_REST + "/consultarListaFuncionario/" +
    			PortalConstantes.URI + "/" + PortalConstantes.CONTEXTO + "/" + PortalConstantes.CONTEXTO_REST + "/consultarFuncionario/100" +
    			PortalConstantes.URI + "/" + PortalConstantes.CONTEXTO + "/" + PortalConstantes.CONTEXTO_REST + "/consultarListaExcecao";
    }
    
	@GET
	@Path(PortalConstantes.OPERACAO_CONSULTAR_LISTA_FUNCIONARIO + "/")
	@Produces(MediaType.APPLICATION_JSON)
	public List<FuncionarioDTO> consultarListaFuncionario() {
    	FuncionarioBC bc = new FuncionarioBC();
    	return FuncionarioDTO.parserFromFuncionario(bc.findAll());
    }
	
	 @GET
	 @Path(PortalConstantes.OPERACAO_CONSULTAR_FUNCIONARIO + "/{codigoFuncionario}")
	@Produces(MediaType.APPLICATION_JSON)
    public FuncionarioDTO consultarFuncionario(@PathParam("codigoFuncionario") final Long codigoFuncionario) {
    	FuncionarioBC dao = new FuncionarioBC();
    	Funcionario f = dao.load(codigoFuncionario);
    	if (f != null) {
    		return FuncionarioDTO.parserFromFuncionario(f);
    	}
    	return (new FuncionarioDTO());
    }
	
	@GET
	@Path(PortalConstantes.OPERACAO_CONSULTAR_LISTA_EXCECAO + "/")
	@Produces(MediaType.APPLICATION_JSON)
	public List<ExcecaoDTO> consultarListaExcecao() {
		ExcecaoCapturadaBC bc = new ExcecaoCapturadaBC();
    	return ExcecaoDTO.parserFromExcecao(bc.findAll());
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
