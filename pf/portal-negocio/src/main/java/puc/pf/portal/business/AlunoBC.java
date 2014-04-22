package puc.pf.portal.business;

import java.util.List;

import puc.pf.portal.domain.Aluno;
import puc.pf.portal.domain.Bookmark;
import puc.pf.portal.persistence.AlunoDAO;
import br.gov.frameworkdemoiselle.lifecycle.Startup;
import br.gov.frameworkdemoiselle.stereotype.BusinessController;
import br.gov.frameworkdemoiselle.template.DelegateCrud;
import br.gov.frameworkdemoiselle.transaction.Transactional;

@BusinessController
public class AlunoBC extends DelegateCrud<Aluno, Long, AlunoDAO> {
	
	private static final long serialVersionUID = 1L;
	
	@Startup
	@Transactional
	public void load() {
		// inserirObjetos();
	}
	
	@Override
	public Aluno insert(Aluno bean) {
		return super.insert(bean);
	}
	
	@Override
	public List<Aluno> findAll() {
		return super.findAll();
	}
	
	@Override
	public Aluno update(Aluno bean) {
		Bookmark mark = null;
		bean.setNome(mark.getDescription());
		return super.update(bean);
	}
	
	public void inserirObjetos() {
		if (findAll().size() == 0) {
			this.insert(new Aluno("Julio", 1001l));
			this.insert(new Aluno("Aline", 1002l));
			this.insert(new Aluno("Pedro", 1003l));
			this.insert(new Aluno("Maria", 1004l));
		}
	}
}
