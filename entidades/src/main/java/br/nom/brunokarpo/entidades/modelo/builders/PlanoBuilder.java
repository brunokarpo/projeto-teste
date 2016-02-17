package br.nom.brunokarpo.entidades.modelo.builders;

import java.util.ArrayList;
import java.util.List;

import br.nom.brunokarpo.entidades.modelo.Modulo;
import br.nom.brunokarpo.entidades.modelo.Plano;
import br.nom.brunokarpo.entidades.modelo.PrecoModulo;

public class PlanoBuilder {

	private Plano instance;

	public PlanoBuilder() {
		instance = new Plano();
		List<PrecoModulo> precoModulos = new ArrayList<PrecoModulo>();

		instance.setPrecoModulos(precoModulos);
	}

	public PlanoBuilder comNome(String nome) {
		instance.setNome(nome);
		return this;
	}

	public PlanoBuilder comPrecoModulo(Modulo modulo, Double valorMinimoFixo, Double valorPorCnpj) {
		instance.getPrecoModulos().add(new PrecoModuloBuilder()
											.comModulo(modulo)
											.comPlano(instance)
											.comValorFixoMensal(valorMinimoFixo)
											.comValorPorCnpj(valorPorCnpj)
											.construir());
		return this;
	}

	public Plano construir() {
		return instance;
	}

}
