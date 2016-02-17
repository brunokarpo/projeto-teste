package br.nom.brunokarpo.entidades.validadores;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import br.nom.brunokarpo.entidades.exception.ValidacaoException;
import br.nom.brunokarpo.entidades.modelo.Modulo;
import br.nom.brunokarpo.entidades.modelo.Plano;
import br.nom.brunokarpo.entidades.modelo.PrecoModulo;
import br.nom.brunokarpo.entidades.modelo.builders.PrecoModuloBuilder;

public class PlanoValidadorTest {

	private Validador<Plano> sut;
	private Plano plano;
	private List<PrecoModulo> modulos;

	@Before
	public void init() throws Exception {
		sut = new PlanoValidador();
		plano = new Plano();
		modulos = new ArrayList<PrecoModulo>();

		plano.setNome("Plano Básico");
		modulos.add(new PrecoModuloBuilder()
						.comModulo(Modulo.EMISSAO_NFE).comPlano(plano)
						.comValorFixoMensal(19.90).comValorPorCnpj(9.90)
						.construir());
		modulos.add(new PrecoModuloBuilder()
						.comModulo(Modulo.EMISSAO_CTE).comPlano(plano)
						.comValorFixoMensal(19.90).comValorPorCnpj(9.90)
						.construir());
		modulos.add(new PrecoModuloBuilder()
						.comModulo(Modulo.EMISSAO_NFCE).comPlano(plano)
						.comValorFixoMensal(19.90).comValorPorCnpj(9.90)
						.construir());
		modulos.add(new PrecoModuloBuilder()
						.comModulo(Modulo.EMISSAO_MDFE).comPlano(plano)
						.comValorFixoMensal(19.90).comValorPorCnpj(9.90)
						.construir());
		modulos.add(new PrecoModuloBuilder()
						.comModulo(Modulo.RECEBE_MDE_AUDIT).comPlano(plano)
						.comValorFixoMensal(19.90).comValorPorCnpj(9.90)
						.construir());

		plano.setPrecoModulos(modulos);
	}

	@Test
	public void deveValidarCorretamenteUmPlanoValido() throws Exception {
		sut.validar(plano);
	}

	@Test(expected=ValidacaoException.class)
	public void naoDeveAceitarNomesVazios() throws Exception {
		plano.setNome("");

		sut.validar(plano);
	}

	@Test(expected=ValidacaoException.class)
	public void naoDeveAceitarPlanoSemModulosPrecificados() throws Exception {
		plano.setPrecoModulos(null);

		sut.validar(plano);
	}

	@Test(expected=ValidacaoException.class)
	public void deveValidarSeTodosOsModulosPossiveisSaoPrecificadosNessePlano() throws Exception {
		plano.getPrecoModulos().remove(0);

		sut.validar(plano);
	}

}
