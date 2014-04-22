package puc.pf.portal.business;

import puc.pf.portal.domain.ExcecaoCapturada;
import puc.pf.portal.persistence.ExcecaoCapturadaDAO;
import br.gov.frameworkdemoiselle.lifecycle.Startup;
import br.gov.frameworkdemoiselle.stereotype.BusinessController;
import br.gov.frameworkdemoiselle.template.DelegateCrud;
import br.gov.frameworkdemoiselle.transaction.Transactional;

@BusinessController
public class ExcecaoCapturadaBC extends DelegateCrud<ExcecaoCapturada, Long, ExcecaoCapturadaDAO> {
	
	private static final long serialVersionUID = 1L;
	
	@Startup
	@Transactional
	public void load() {
		// inserirObjetos();
	}
	
	@Transactional
	public void inserirObjetos() {
		if (findAll().isEmpty()) {
			insert(new ExcecaoCapturada("java.lang.NullPointerException",
					"javax.faces.FacesException: #{manterAlunoMB.update}: java.lang.NullPointerException"
					+ "  at com.sun.faces.lifecycle.InvokeApplicationPhase.execute(InvokeApplicationPhase.java:89)"
					+ "  at com.sun.faces.lifecycle.Phase.doPhase(Phase.java:101)"
					+ "  ..."));
			  
			insert(new ExcecaoCapturada("java.lang.IndexOutOfBounds",
					"javax.faces.FacesException: #{manterAlunoMB.update}: java.lang.IndexOutOfBounds"
					+ "  at com.sun.faces.lifecycle.InvokeApplicationPhase.execute(InvokeApplicationPhase.java:89)"
					+ "  at com.sun.faces.lifecycle.Phase.doPhase(Phase.java:101)"
					+ "  ..."));
		}
	}
}
