package br.nom.brunokarpo.entidades.validadores;

import br.nom.brunokarpo.entidades.exception.ValidacaoException;
import br.nom.brunokarpo.entidades.modelo.Plano;

public class PlanoValidador implements Validador<Plano> {

	@Override
	public void validar(Plano plano) throws ValidacaoException {
		validarNomeVazio(plano);

	}

	private void validarNomeVazio(Plano plano) throws ValidacaoException {
		if(plano.getNome() == null || "".equals(plano.getNome())) {
			throw new ValidacaoException();
		}
	}

}
