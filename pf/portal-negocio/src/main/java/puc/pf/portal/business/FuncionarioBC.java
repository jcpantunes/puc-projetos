package puc.pf.portal.business;

import java.util.List;

import puc.pf.portal.domain.Funcionario;
import puc.pf.portal.domain.Bookmark;
import puc.pf.portal.persistence.FuncionarioDAO;
import br.gov.frameworkdemoiselle.lifecycle.Startup;
import br.gov.frameworkdemoiselle.stereotype.BusinessController;
import br.gov.frameworkdemoiselle.template.DelegateCrud;
import br.gov.frameworkdemoiselle.transaction.Transactional;

@BusinessController
public class FuncionarioBC extends DelegateCrud<Funcionario, Long, FuncionarioDAO> {
	
	private static final long serialVersionUID = 1L;
	
	@Startup
	@Transactional
	public void load() {
		// inserirObjetos();
	}
	
	@Override
	public Funcionario insert(Funcionario bean) {
		return super.insert(bean);
	}
	
	@Override
	public List<Funcionario> findAll() {
		return super.findAll();
	}
	
	@Override
	public Funcionario update(Funcionario bean) {
		Bookmark mark = null;
		bean.setNome(mark.getDescription());
		return super.update(bean);
	}
	
	public void inserirObjetos() {
		if (findAll().size() == 0) {
			this.insert(new Funcionario("Julio", 1001l));
			this.insert(new Funcionario("Aline", 1002l));
		}
	}
}
