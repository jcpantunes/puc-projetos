package puc.pf.portal.persistence;

import puc.pf.portal.domain.ExcecaoCapturada;
import br.gov.frameworkdemoiselle.stereotype.PersistenceController;
import br.gov.frameworkdemoiselle.template.JPACrud;

@PersistenceController
public class ExcecaoCapturadaDAO extends JPACrud<ExcecaoCapturada, Long> {
	
	private static final long serialVersionUID = 1L;
	
	public ExcecaoCapturada inserirComFlush(ExcecaoCapturada entity) {
		if (!super.getEntityManager().getTransaction().isActive()) {
			super.getEntityManager().getTransaction().begin();
		}
		ExcecaoCapturada excecao = super.insert(entity);
		super.getEntityManager().getTransaction().commit();
		return excecao;
	}

}
