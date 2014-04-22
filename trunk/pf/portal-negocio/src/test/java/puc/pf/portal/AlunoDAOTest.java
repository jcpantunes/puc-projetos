package puc.pf.portal;

import java.util.List;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;

import puc.pf.portal.business.AlunoBC;
import puc.pf.portal.domain.Aluno;
import br.gov.frameworkdemoiselle.junit.DemoiselleRunner;

@RunWith(DemoiselleRunner.class)
public class AlunoDAOTest {

	@Inject
	private AlunoBC bc;

	@Test
	public void say() {
		// bc.inserirObjetos();
		
		List<Aluno> lista = bc.findAll();
		for (Aluno obj : lista) {
			System.out.println("====================> " + obj.getNome());
		}
	}
}
