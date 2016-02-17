package br.nom.brunokarpo.repositorio.impl.jpa.repositorio;

import static org.junit.Assert.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import br.nom.brunkarpo.repositorio.impl.jpa.PlanoRepositorioJPA;
import br.nom.brunokarpo.entidades.modelo.Modulo;
import br.nom.brunokarpo.entidades.modelo.Plano;
import br.nom.brunokarpo.entidades.modelo.builders.PlanoBuilder;

public class PlanoRepositorioJPAIT {

	private static EntityManagerFactory factory;
	private EntityManager manager;
	private PlanoRepositorioJPA sut;

	private Plano plano;

	@BeforeClass
	public static void initClass() throws Exception {
		factory = Persistence.createEntityManagerFactory("projetoTestePuTeste");
	}

	@Before
	public void init() throws Exception {
		manager = factory.createEntityManager();
		sut = new PlanoRepositorioJPA(manager);
	}

	@Test
	public void deveSalvarUmPlanoValido() throws Exception {
		montarUmPlano();

		sut.salvar(plano);
	}

	private void montarUmPlano() {
		plano = new PlanoBuilder()
					.comNome("Plano Básico")
					.comPrecoModulo(Modulo.EMISSAO_NFE, 19.90, 9.90)
					.comPrecoModulo(Modulo.EMISSAO_CTE, 19.90, 9.90)
					.comPrecoModulo(Modulo.EMISSAO_NFCE, 19.90, 9.90)
					.comPrecoModulo(Modulo.EMISSAO_MDFE, 19.90, 9.90)
					.comPrecoModulo(Modulo.RECEBE_MDE_AUDIT, 19.90, 9.90)
					.construir();

	}

	@After
	public void finish() throws Exception {
		manager.close();
	}

	@AfterClass
	public static void finishClass() throws Exception {
		factory.close();
	}

}
