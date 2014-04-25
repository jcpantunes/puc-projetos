package puc.pf.portal.persistence;

import puc.pf.portal.domain.Funcionario;
import br.gov.frameworkdemoiselle.stereotype.PersistenceController;
import br.gov.frameworkdemoiselle.template.JPACrud;

@PersistenceController
public class FuncionarioDAO extends JPACrud<Funcionario, Long> {
	
	private static final long serialVersionUID = 1L;

}
