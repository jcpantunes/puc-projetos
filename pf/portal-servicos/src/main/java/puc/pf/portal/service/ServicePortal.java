package puc.pf.portal.service;

import java.util.List;

import javax.jws.WebService;

import puc.pf.portal.IServicePortal;
import puc.pf.portal.business.AlunoBC;
import puc.pf.portal.business.ExcecaoCapturadaBC;
import puc.pf.portal.dto.AlunoDTO;
import puc.pf.portal.dto.ExcecaoCapturadaDTO;

import com.sun.xml.ws.developer.SchemaValidation;

@SchemaValidation
@WebService(endpointInterface="puc.pf.portal.IServicePortal", portName="IServicePortalPort",  serviceName="IServicePortal")
public class ServicePortal implements IServicePortal {
	
	public List<AlunoDTO> consultarListaAluno() {
    	AlunoBC bc = new AlunoBC();
    	return AlunoDTO.parserFromAluno(bc.findAll());
    }
    
	public List<ExcecaoCapturadaDTO> consultarListaExcecao() {
		ExcecaoCapturadaBC bc = new ExcecaoCapturadaBC();
    	return ExcecaoCapturadaDTO.parserFromExcecao(bc.findAll());
    }
	
//    public AlunoDTO consultarAluno(Integer codigoAluno) {
//    	AlunoDAO dao = new AlunoDAO();
//    	Aluno f = dao.listarPorCodigo(codigoAluno);
//    	if (f != null) {
//    		return AlunoDTO.parserFromAluno(f);
//    	}
//    	return (new AlunoDTO());
//    }
//    
//    public List<TarefaDTO> consultarListaTarefa() {
//    	TarefaDAO dao = new TarefaDAO();
//    	return TarefaDTO.parserFromTarefa(dao.listar());
//    }
//    
//    public TarefaDTO consultarTarefa(Integer codigoTarefa) {
//    	TarefaDAO dao = new TarefaDAO();
//    	Tarefa t = dao.listarPorCodigo(codigoTarefa);
//    	if (t != null) {
//    		return TarefaDTO.parserFromTarefa(t);
//    	}
//    	return (new TarefaDTO());
//    }
//    
//    public List<TarefaDTO> consultarTarefasAluno(Integer codigoAluno) {
//    	AlunoDAO dao = new AlunoDAO();
//    	Aluno f = dao.listarPorCodigo(codigoAluno);
//    	if (f != null) {
//    		return TarefaDTO.parserFromTarefa(f.getListaTarefa());
//    	}
//    	return new ArrayList<TarefaDTO>();	
//    }
}
