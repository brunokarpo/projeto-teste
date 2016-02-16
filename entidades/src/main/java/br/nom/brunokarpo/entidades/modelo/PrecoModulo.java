package br.nom.brunokarpo.entidades.modelo;

import java.math.BigDecimal;

public class PrecoModulo extends Entidade {

	private static final long serialVersionUID = -8693335624248898989L;

	private Modulo modulo;
	private BigDecimal valorFixoMensal;
	private BigDecimal valorPorCnpj;

	/**
	 * @return the modulo
	 */
	public Modulo getModulo() {
		return modulo;
	}
	/**
	 * @param modulo the modulo to set
	 */
	public void setModulo(Modulo modulo) {
		this.modulo = modulo;
	}
	/**
	 * @return the valorFixoMensal
	 */
	public BigDecimal getValorFixoMensal() {
		return valorFixoMensal;
	}
	/**
	 * @param valorFixoMensal the valorFixoMensal to set
	 */
	public void setValorFixoMensal(BigDecimal valorFixoMensal) {
		this.valorFixoMensal = valorFixoMensal;
	}
	/**
	 * @return the valorPorCnpj
	 */
	public BigDecimal getValorPorCnpj() {
		return valorPorCnpj;
	}
	/**
	 * @param valorPorCnpj the valorPorCnpj to set
	 */
	public void setValorPorCnpj(BigDecimal valorPorCnpj) {
		this.valorPorCnpj = valorPorCnpj;
	}

}
