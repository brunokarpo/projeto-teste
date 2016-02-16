package br.nom.brunokarpo.entidades.modelo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Plano extends Entidade {

	private static final long serialVersionUID = -3244056956846691223L;
	private String nome;
	private List<PrecoModulo> modulos;

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

	/**
	 * @return the modulos
	 */
	@OneToMany(mappedBy="plano")
	public List<PrecoModulo> getModulos() {
		return modulos;
	}

	/**
	 * @param modulos the modulos to set
	 */
	public void setModulos(List<PrecoModulo> modulos) {
		this.modulos = modulos;
	}

}
