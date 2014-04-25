package puc.pf.portal.persistence;

import puc.pf.portal.domain.Tarefa;
import br.gov.frameworkdemoiselle.stereotype.PersistenceController;
import br.gov.frameworkdemoiselle.template.JPACrud;

@PersistenceController
public class TarefaDAO extends JPACrud<Tarefa, Long> {
	
	private static final long serialVersionUID = 1L;
	
}
