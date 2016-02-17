package br.nom.brunokarpo.negocio;

import br.nom.brunokarpo.entidades.exception.ValidacaoException;
import br.nom.brunokarpo.entidades.modelo.Entidade;
import br.nom.brunokarpo.entidades.validadores.Validador;

public abstract class AbstractNegocio<I extends Entidade> {

	public void incluir(I entidade) throws ValidacaoException {
		getValidador().validar(entidade);
	}

	protected abstract Validador<I> getValidador();

}
