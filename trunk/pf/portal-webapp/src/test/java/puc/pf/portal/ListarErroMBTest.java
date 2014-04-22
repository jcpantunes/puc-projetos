package puc.pf.portal;

import java.util.List;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;

import puc.pf.portal.business.ExcecaoCapturadaBC;
import puc.pf.portal.domain.ExcecaoCapturada;
import br.gov.frameworkdemoiselle.junit.DemoiselleRunner;

@RunWith(DemoiselleRunner.class)
public class ListarErroMBTest {

	@Inject
	private ExcecaoCapturadaBC bc;
	
	@Test
	public void testLoad() {
		bc.load();
		
		List<ExcecaoCapturada> lista = bc.findAll();
		for (ExcecaoCapturada obj : lista) {
			System.out.println("====================> " + obj.getTipoExcecao());
		}
	}
	
}
