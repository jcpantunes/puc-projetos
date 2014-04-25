package puc.pf.portal.view;

import javax.inject.Inject;

import puc.pf.portal.business.FuncionarioBC;
import puc.pf.portal.business.BookmarkBC;
import puc.pf.portal.business.TarefaBC;
import puc.pf.portal.business.ExcecaoCapturadaBC;
import puc.pf.portal.domain.BaseBean;
import puc.pf.portal.domain.Funcionario;
import br.gov.frameworkdemoiselle.stereotype.ViewController;
import br.gov.frameworkdemoiselle.template.AbstractEditPageBean;
import br.gov.frameworkdemoiselle.transaction.Transactional;

@ViewController
public class IndexMB extends AbstractEditPageBean<BaseBean, Long> {

	private static final long serialVersionUID = 1L;

	@Inject
	private BookmarkBC bookmarkBC;
	@Inject
	private FuncionarioBC funcionarioBC;
	@Inject
	private TarefaBC tarefaBC;
	@Inject
	private ExcecaoCapturadaBC excecaoBC;
	

	@Override
	@Transactional
	public String delete() {
		return "";
	}

	@Override
	@Transactional
	public String insert() {
		this.bookmarkBC.inserirObjetos();
		this.funcionarioBC.inserirObjetos();
		Funcionario func = this.funcionarioBC.insert(new Funcionario("Pedro", 2001l));
		this.tarefaBC.inserirObjetos(func);
		this.excecaoBC.inserirObjetos();
		return "";
	}

	@Override
	@Transactional
	public String update() {
		return "";
	}

	@Override
	protected BaseBean handleLoad(Long id) {
		return new BaseBean();
	}

}
