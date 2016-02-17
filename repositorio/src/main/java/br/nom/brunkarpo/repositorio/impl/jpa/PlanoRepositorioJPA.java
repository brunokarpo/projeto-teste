package br.nom.brunkarpo.repositorio.impl.jpa;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import br.nom.brunkarpo.repositorio.PlanoAbstractRepositorio;
import br.nom.brunokarpo.entidades.modelo.Plano;

public class PlanoRepositorioJPA extends PlanoAbstractRepositorio {

	private static final long serialVersionUID = -8348685550105463168L;

	@Inject private EntityManager manager;

	@Override
	public void salvar(Plano plano) {
		manager.getTransaction().begin();
		manager.merge(plano);
		manager.getTransaction().commit();
	}

	@Override
	public Plano buscarPorId(Long id) {
		return manager.find(Plano.class, id);
	}

	@Override
	protected Plano buscarPorNome(String nome) {
		// TODO fazer depois
		return null;
	}

}
