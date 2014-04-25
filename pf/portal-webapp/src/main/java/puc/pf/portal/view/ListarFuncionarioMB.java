package puc.pf.portal.view;

import java.util.Iterator;
import java.util.List;

import javax.inject.Inject;

import puc.pf.portal.business.FuncionarioBC;
import puc.pf.portal.domain.Funcionario;
import br.gov.frameworkdemoiselle.annotation.NextView;
import br.gov.frameworkdemoiselle.annotation.PreviousView;
import br.gov.frameworkdemoiselle.stereotype.ViewController;
import br.gov.frameworkdemoiselle.template.AbstractListPageBean;
import br.gov.frameworkdemoiselle.transaction.Transactional;

@ViewController
@NextView("/private/funcionario/manterfuncionario.xhtml")
@PreviousView("/private/funcionario/listarfuncionario.xhtml")
public class ListarFuncionarioMB extends AbstractListPageBean<Funcionario, Long> {

	private static final long serialVersionUID = 1L;

	@Inject
	private FuncionarioBC bc;

	@Override
	protected List<Funcionario> handleResultList() {
		return this.bc.findAll();
	}
	
	@Transactional
	public String deleteSelection() {
		boolean delete;
		for (Iterator<Long> iter = getSelection().keySet().iterator(); iter.hasNext();) {
			Long id = iter.next();
			delete = getSelection().get(id);

			if (delete) {
				bc.delete(id);
				iter.remove();
			}
		}
		return getPreviousView();
	}
}