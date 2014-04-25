package puc.pf.portal.view;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import puc.pf.portal.business.FuncionarioBC;
import puc.pf.portal.business.TarefaBC;
import puc.pf.portal.domain.Funcionario;
import puc.pf.portal.domain.Tarefa;
import br.gov.frameworkdemoiselle.annotation.PreviousView;
import br.gov.frameworkdemoiselle.stereotype.ViewController;
import br.gov.frameworkdemoiselle.template.AbstractEditPageBean;
import br.gov.frameworkdemoiselle.transaction.Transactional;

@ViewController
@PreviousView("/private/funcionario/listarfuncionario.xhtml")
public class ManterTarefaMB extends AbstractEditPageBean<Tarefa, Long> {

	private static final long serialVersionUID = 1L;

	@Inject
	private TarefaBC bc;
	
	@Inject
	private FuncionarioBC funcionarioBC;
	
	private List<Funcionario> listaFuncionario = new ArrayList<Funcionario>();
	
	@PostConstruct
    public void init() {
		listaFuncionario = this.funcionarioBC.findAll();
	}
	
	@Override
	@Transactional
	public String delete() {
		this.bc.delete(getId());
		return getPreviousView();
	}
	
	@Override
	@Transactional
	public String insert() {
		this.bc.insert(getBean());
		return getPreviousView();
	}

	@Override
	@Transactional
	public String update() {
		this.bc.update(getBean());
		return getPreviousView();
	}

	@Override
	protected Tarefa handleLoad(Long id) {
		return this.bc.load(id);
	}
	
	public List<Funcionario> getListaFuncionario() {
		return listaFuncionario;
	}
	
	public void setListaFuncionario(List<Funcionario> listaFuncionario) {
		this.listaFuncionario = listaFuncionario;
	}
	
}
