package puc.pf.portal.view;

import java.util.List;

import javax.inject.Inject;

import puc.pf.portal.business.ExcecaoCapturadaBC;
import puc.pf.portal.domain.ExcecaoCapturada;
import br.gov.frameworkdemoiselle.annotation.NextView;
import br.gov.frameworkdemoiselle.annotation.PreviousView;
import br.gov.frameworkdemoiselle.stereotype.ViewController;
import br.gov.frameworkdemoiselle.template.AbstractListPageBean;

@ViewController
@NextView("/private/excecaocapturada/manterexcecao.xhtml")
@PreviousView("/private/excecaocapturada/listarexceceao.xhtml")
public class ListarExcecaoCapturadaMB extends AbstractListPageBean<ExcecaoCapturada, Long> {

	private static final long serialVersionUID = 1L;

	@Inject
	private ExcecaoCapturadaBC bc;

	@Override
	protected List<ExcecaoCapturada> handleResultList() {
		this.bc.inserirObjetos();
		
		return this.bc.findAll();
	}

}