package br.nom.brunokarpo.negocio;

import javax.inject.Inject;

import br.nom.brunokarpo.entidades.modelo.Plano;
import br.nom.brunokarpo.entidades.validadores.Validador;

public class PlanoNegocio extends AbstractNegocio<Plano> {

	@Inject private Validador<Plano> validador;

	@Override
	protected Validador<Plano> getValidador() {
		return validador;
	}

}
