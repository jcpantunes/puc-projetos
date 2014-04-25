package puc.pf.portal;

import java.util.List;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;

import puc.pf.portal.business.FuncionarioBC;
import puc.pf.portal.domain.Funcionario;
import br.gov.frameworkdemoiselle.junit.DemoiselleRunner;

@RunWith(DemoiselleRunner.class)
public class AlunoDAOTest {

	@Inject
	private FuncionarioBC bc;

	@Test
	public void say() {
		// bc.inserirObjetos();
		
		List<Funcionario> lista = bc.findAll();
		for (Funcionario obj : lista) {
			System.out.println("====================> " + obj.getNome());
		}
	}
}
