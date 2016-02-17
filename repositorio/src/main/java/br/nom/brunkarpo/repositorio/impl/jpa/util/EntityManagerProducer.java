package br.nom.brunkarpo.repositorio.impl.jpa.util;

import javax.enterprise.inject.Disposes;
import javax.enterprise.inject.Produces;
import javax.inject.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

@Singleton
public class EntityManagerProducer {

	private EntityManagerFactory factory;

	public EntityManagerProducer() {
		this.factory = Persistence.createEntityManagerFactory("projetoTestePu");
	}

	@Produces
    public EntityManager getEntityManager() {
        return factory.createEntityManager();
    }

	public void closeEntityManager(@Disposes EntityManager em) {
        if (em != null && em.getTransaction().isActive()) {
            em.getTransaction().rollback();
        }
        if (em != null && em.isOpen()) {
            em.close();
        }
    }

}