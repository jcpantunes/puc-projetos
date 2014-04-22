package puc.pf.portal.view;

import javax.inject.Inject;

import puc.pf.portal.business.AlunoBC;
import puc.pf.portal.business.BookmarkBC;
import puc.pf.portal.business.ExcecaoCapturadaBC;
import puc.pf.portal.domain.BaseBean;
import br.gov.frameworkdemoiselle.stereotype.ViewController;
import br.gov.frameworkdemoiselle.template.AbstractEditPageBean;
import br.gov.frameworkdemoiselle.transaction.Transactional;

@ViewController
public class IndexMB extends AbstractEditPageBean<BaseBean, Long> {

	private static final long serialVersionUID = 1L;

	@Inject
	private AlunoBC alunoBC;
	@Inject
	private BookmarkBC bookmarkBC;
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
		this.alunoBC.inserirObjetos();
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
