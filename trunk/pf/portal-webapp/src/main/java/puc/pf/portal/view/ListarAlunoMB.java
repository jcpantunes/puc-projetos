package puc.pf.portal.view;

import java.util.Iterator;
import java.util.List;

import javax.inject.Inject;

import puc.pf.portal.business.AlunoBC;
import puc.pf.portal.domain.Aluno;
import br.gov.frameworkdemoiselle.annotation.NextView;
import br.gov.frameworkdemoiselle.annotation.PreviousView;
import br.gov.frameworkdemoiselle.stereotype.ViewController;
import br.gov.frameworkdemoiselle.template.AbstractListPageBean;
import br.gov.frameworkdemoiselle.transaction.Transactional;

@ViewController
@NextView("/private/aluno/manteraluno.xhtml")
@PreviousView("/private/aluno/listaraluno.xhtml")
public class ListarAlunoMB extends AbstractListPageBean<Aluno, Long> {

	private static final long serialVersionUID = 1L;

	@Inject
	private AlunoBC bc;

	@Override
	protected List<Aluno> handleResultList() {
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