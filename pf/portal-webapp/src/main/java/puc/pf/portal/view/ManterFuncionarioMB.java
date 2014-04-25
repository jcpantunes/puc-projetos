package puc.pf.portal.view;

import javax.inject.Inject;

import puc.pf.portal.business.FuncionarioBC;
import puc.pf.portal.domain.Funcionario;
import br.gov.frameworkdemoiselle.annotation.PreviousView;
import br.gov.frameworkdemoiselle.stereotype.ViewController;
import br.gov.frameworkdemoiselle.template.AbstractEditPageBean;
import br.gov.frameworkdemoiselle.transaction.Transactional;

@ViewController
@PreviousView("/private/funcionario/listarfuncionario.xhtml")
public class ManterFuncionarioMB extends AbstractEditPageBean<Funcionario, Long> {

	private static final long serialVersionUID = 1L;

	@Inject
	private FuncionarioBC bc;

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
	protected Funcionario handleLoad(Long id) {
		return this.bc.load(id);
	}

}
