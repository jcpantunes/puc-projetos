package puc.pf.portal.business;

import java.util.List;

import puc.pf.portal.domain.BaseBean;
import puc.pf.portal.domain.Funcionario;
import puc.pf.portal.domain.Tarefa;
import puc.pf.portal.persistence.TarefaDAO;
import br.gov.frameworkdemoiselle.lifecycle.Startup;
import br.gov.frameworkdemoiselle.stereotype.BusinessController;
import br.gov.frameworkdemoiselle.template.DelegateCrud;
import br.gov.frameworkdemoiselle.transaction.Transactional;

@BusinessController
public class TarefaBC extends DelegateCrud<Tarefa, Long, TarefaDAO> {
	
	private static final long serialVersionUID = 1L;
	
	@Startup
	@Transactional
	public void load() {
		// inserirObjetos();
	}
	
	@Override
	public Tarefa insert(Tarefa bean) {
		return super.insert(bean);
	}
	
	@Override
	public List<Tarefa> findAll() {
		return super.findAll();
	}
	
	public void inserirObjetos(Funcionario funcionario) {
		if (findAll().size() == 0) {
			this.insert(new Tarefa("Implementar Visao", BaseBean.retornaDataDate("23/04/2014"), funcionario));
			this.insert(new Tarefa("Implementar Negocio", BaseBean.retornaDataDate("24/04/2014"), funcionario));
		}
	}
}
