package puc.pf.portal.view;

import java.util.Iterator;
import java.util.List;

import javax.inject.Inject;

import puc.pf.portal.business.TarefaBC;
import puc.pf.portal.domain.Tarefa;
import br.gov.frameworkdemoiselle.annotation.NextView;
import br.gov.frameworkdemoiselle.annotation.PreviousView;
import br.gov.frameworkdemoiselle.stereotype.ViewController;
import br.gov.frameworkdemoiselle.template.AbstractListPageBean;
import br.gov.frameworkdemoiselle.transaction.Transactional;

@ViewController
@NextView("/private/tarefa/mantertarefa.xhtml")
@PreviousView("/private/tarefa/listartarefa.xhtml")
public class ListarTarefaMB extends AbstractListPageBean<Tarefa, Long> {

	private static final long serialVersionUID = 1L;

	@Inject
	private TarefaBC bc;

	@Override
	protected List<Tarefa> handleResultList() {
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