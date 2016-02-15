package br.nom.brunokarpo.entidades.validadores;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.nom.brunokarpo.entidades.exception.ValidacaoException;
import br.nom.brunokarpo.entidades.modelo.Plano;

public class PlanoValidadorTest {

	private Validador<Plano> sut;
	private Plano plano;

	@Before
	public void init() throws Exception {
		sut = new PlanoValidador();
		plano = new Plano();
	}

	@Test(expected=ValidacaoException.class)
	public void naoDeveAceitarNomesVazios() throws Exception {
		plano.setNome("");

		sut.validar(plano);
	}

}
