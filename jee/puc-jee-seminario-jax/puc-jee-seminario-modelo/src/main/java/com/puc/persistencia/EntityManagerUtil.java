package com.puc.persistencia;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerUtil {
	
	public static EntityManagerFactory getEntityManagerFactory() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("postgres-ds");
		// EntityManager em = emf.createEntityManager();
		return emf;
	}

}
