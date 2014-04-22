package puc.pf.portal.persistence;

import puc.pf.portal.domain.Aluno;
import br.gov.frameworkdemoiselle.stereotype.PersistenceController;
import br.gov.frameworkdemoiselle.template.JPACrud;

@PersistenceController
public class AlunoDAO extends JPACrud<Aluno, Long> {
	
	private static final long serialVersionUID = 1L;
	
	public Aluno inserirComFlush(Aluno entity) {
		Aluno aluno = super.insert(entity);
		super.getEntityManager().flush();
		return aluno;
	}
}
