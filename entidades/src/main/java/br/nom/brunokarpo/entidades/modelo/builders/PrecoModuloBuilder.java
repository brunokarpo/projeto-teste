package br.nom.brunokarpo.entidades.modelo.builders;

import java.math.BigDecimal;

import br.nom.brunokarpo.entidades.modelo.Modulo;
import br.nom.brunokarpo.entidades.modelo.Plano;
import br.nom.brunokarpo.entidades.modelo.PrecoModulo;

public class PrecoModuloBuilder {

	private PrecoModulo instance;

	public PrecoModuloBuilder() {
		instance = new PrecoModulo();
	}

	public PrecoModuloBuilder comModulo(Modulo modulo) {
		instance.setModulo(modulo);
		return this;
	}

	public PrecoModuloBuilder comPlano(Plano plano) {
		instance.setPlano(plano);
		return this;
	}

	public PrecoModuloBuilder comValorFixoMensal(Double valorFixoMensal) {
		instance.setValorFixoMensal(new BigDecimal(valorFixoMensal));
		return this;
	}

	public PrecoModuloBuilder comValorPorCnpj(Double valorPorCnpj) {
		instance.setValorPorCnpj(new BigDecimal(valorPorCnpj));
		return this;
	}

	public PrecoModulo construir() {
		return instance;
	}

}
