package br.nom.brunokarpo.entidades.validadores;

import java.util.ArrayList;
import java.util.List;

import br.nom.brunokarpo.entidades.exception.ValidacaoException;
import br.nom.brunokarpo.entidades.modelo.Modulo;
import br.nom.brunokarpo.entidades.modelo.Plano;
import br.nom.brunokarpo.entidades.modelo.PrecoModulo;

public class PlanoValidador implements Validador<Plano> {

	@Override
	public void validar(Plano plano) throws ValidacaoException {
		validarNomeVazio(plano);
		validarListaModulos(plano);
		validarSeTodosOsModulosEstaoPreenchidos(plano);
	}

	private void validarNomeVazio(Plano plano) throws ValidacaoException {
		if(plano.getNome() == null || "".equals(plano.getNome())) {
			throw new ValidacaoException();
		}
	}

	private void validarListaModulos(Plano plano) throws ValidacaoException {
		if(plano.getPrecoModulos() == null || plano.getPrecoModulos().isEmpty()) {
			throw new ValidacaoException();
		}
	}

	private void validarSeTodosOsModulosEstaoPreenchidos(Plano plano) throws ValidacaoException {
		List<Modulo> modulosPreenchidos = new ArrayList<Modulo>();

		for(PrecoModulo precoModulo : plano.getPrecoModulos()) {
			Modulo moduloAvaliado = precoModulo.getModulo();
			if(!modulosPreenchidos.contains(moduloAvaliado)) {
				modulosPreenchidos.add(moduloAvaliado);
			}
		}

		for(Modulo modulo : Modulo.values()) {
			if(!modulosPreenchidos.contains(modulo)) {
				throw new ValidacaoException();
			}
		}


	}

}
