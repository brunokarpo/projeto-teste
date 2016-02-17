package br.nom.brunkarpo.repositorio;

import br.nom.brunokarpo.entidades.modelo.Plano;

public abstract class PlanoAbstractRepositorio implements IRepositorio<Plano> {

	private static final long serialVersionUID = 7456113762092030947L;

	@Override
	public final Plano buscarPorAtributosUnicos(Plano plano) {
		return buscarPorNome(plano.getNome());
	}

	protected abstract Plano buscarPorNome(String nome);

}
