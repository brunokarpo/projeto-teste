package br.nom.brunkarpo.repositorio;

import java.io.Serializable;

import br.nom.brunokarpo.entidades.modelo.Entidade;

public interface IRepositorio<I extends Entidade> extends Serializable {

	void salvar(I entidade);

	I buscarPorId(Long id);

	I buscarPorAtributosUnicos(I entidade);

}
