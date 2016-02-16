package br.nom.brunokarpo.entidades.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Plano extends Entidade {

	private static final long serialVersionUID = -3244056956846691223L;
	private String nome;

	/**
	 * @return the nome
	 */
	@Column(name="nome", length=40, nullable=false)
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}



}
