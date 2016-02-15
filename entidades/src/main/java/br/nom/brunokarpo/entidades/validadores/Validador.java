package br.nom.brunokarpo.entidades.validadores;

import br.nom.brunokarpo.entidades.exception.ValidacaoException;
import br.nom.brunokarpo.entidades.modelo.Entidade;

public interface Validador<E extends Entidade> {

	void validar(E entidade) throws ValidacaoException;

}
