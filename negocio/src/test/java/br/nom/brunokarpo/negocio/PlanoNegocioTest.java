package br.nom.brunokarpo.negocio;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.nom.brunokarpo.entidades.modelo.Plano;

public class PlanoNegocioTest {

	private AbstractNegocio<Plano> sut;

	@Before
	public void init() throws Exception {
		sut = new PlanoNegocio();
	}

	@Test
	public void deve_existir_implementacao_de_abstract_negocio_para_plano() throws Exception {
		assertNotNull(sut);
		assertTrue(sut instanceof PlanoNegocio);
	}

}
