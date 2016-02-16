package br.nom.brunokarpo.entidades.modelo;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name="preco_modulo")
public class PrecoModulo extends Entidade {

	private static final long serialVersionUID = -8693335624248898989L;

	private Modulo modulo;
	private BigDecimal valorFixoMensal;
	private BigDecimal valorPorCnpj;
	private Plano plano;

	/**
	 * @return the modulo
	 */
	@Enumerated(EnumType.STRING)
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
	@Column(name="valor_fixo_mensal", nullable=false)
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
	@Column(name="valor_por_cnpj", nullable=false)
	public BigDecimal getValorPorCnpj() {
		return valorPorCnpj;
	}
	/**
	 * @param valorPorCnpj the valorPorCnpj to set
	 */
	public void setValorPorCnpj(BigDecimal valorPorCnpj) {
		this.valorPorCnpj = valorPorCnpj;
	}

	/**
	 * @return the plano
	 */
	@ManyToOne
	@JoinColumn(name="id_plano", nullable=false)
	public Plano getPlano() {
		return plano;
	}
	/**
	 * @param plano the plano to set
	 */
	public void setPlano(Plano plano) {
		this.plano = plano;
	}

}
