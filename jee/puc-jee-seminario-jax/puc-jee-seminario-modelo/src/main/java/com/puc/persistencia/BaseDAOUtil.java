package com.puc.persistencia;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.puc.dominio.BaseBean;

public abstract class BaseDAOUtil<T extends BaseBean> {

	protected final String FUNCIONARIO = "Funcionario";
	
	protected final String TAREFA = "Tarefa";
	
	@PersistenceContext
    private EntityManager entityManager;
	
	public BaseDAOUtil() {
	}
	
	protected EntityManager getEntityManager() {
		if (entityManager == null || !entityManager.isOpen()) {
			entityManager = EntityManagerUtil.getEntityManagerFactory().createEntityManager();
		}
		return entityManager;
	}
	
	protected void salvar(T objeto) {
		EntityTransaction transacao = this.getEntityManager().getTransaction();
		transacao.begin();
		this.getEntityManager().persist(objeto);
		this.getEntityManager().flush();
		transacao.commit();
		this.getEntityManager().close();
	}
	
	@SuppressWarnings("unchecked")
	protected List<T> listar(String tipo) {
		String hql = "from " + tipo;
		return this.getEntityManager().createQuery(hql).getResultList();
	}
	
	@SuppressWarnings("unchecked")
	protected T listar(Integer id, String tipo) {
		String hql = "from " + tipo + " where id = :ID";
		Query query = this.getEntityManager().createQuery(hql);
		query.setParameter("ID", id);
        return (T) query.getSingleResult();
	}
	
	@SuppressWarnings("unchecked")
	protected T listarPorCodigo(int codigo, String tipo) {
		String hql = "from " + tipo + " where codigo = :CODIGO";
		Query query = this.getEntityManager().createQuery(hql);
		query.setParameter("CODIGO", codigo);
        return (T) query.getSingleResult();
        
	}
	
//	private List<Tarefa> preencherListaTarefa() {
//		List<Tarefa> lista = new ArrayList<Tarefa>();
//		lista.add(new Tarefa(1, 101, "Implementar Camada View", "01/09/2013"));
//		lista.add(new Tarefa(2, 102, "Implementar Camada Controle", "02/09/2013"));
//		lista.add(new Tarefa(3, 103, "Implementar Camada Negocio", "03/09/2013"));
//		lista.add(new Tarefa(4, 104, "Implementar Camada DAO", "04/09/2013"));
//		return lista;
//	}
//	
//	private List<Funcionario> preencherListaFuncionario() {
//		List<Funcionario> lista = new ArrayList<Funcionario>();
//		lista.add(new Funcionario(100, "Julio"));
//		lista.add(new Funcionario(200, "Adriano"));
//		lista.add(new Funcionario(300, "Thiago"));
//		return lista;
//	}
	

}
