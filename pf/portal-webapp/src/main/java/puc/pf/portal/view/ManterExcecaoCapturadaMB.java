package puc.pf.portal.view;

import javax.inject.Inject;

import puc.pf.portal.business.ExcecaoCapturadaBC;
import puc.pf.portal.domain.ExcecaoCapturada;
import br.gov.frameworkdemoiselle.stereotype.ViewController;
import br.gov.frameworkdemoiselle.template.AbstractEditPageBean;
import br.gov.frameworkdemoiselle.transaction.Transactional;

@ViewController
public class ManterExcecaoCapturadaMB extends AbstractEditPageBean<ExcecaoCapturada, Long> {

	private static final long serialVersionUID = 1L;

	@Inject
	private ExcecaoCapturadaBC bc;

	@Override
	@Transactional
	public String delete() {
		this.bc.delete(getId());
		return getPreviousView();
	}

	@Override
	@Transactional
	public String insert() {
		this.bc.insert(getBean());
		return getPreviousView();
	}

	@Override
	@Transactional
	public String update() {
		this.bc.update(getBean());
		return getPreviousView();
	}

	@Override
	protected ExcecaoCapturada handleLoad(Long id) {
		return this.bc.load(id);
	}
	
	@Override
	public void setBean(ExcecaoCapturada bean) {
		super.setBean(bean);
	}
	
	public void setBc(ExcecaoCapturadaBC bc) {
		this.bc = bc;
	}

}
