package com.aulaJpaMaven.aulaJpaMaven.application;

import com.aulaJpaMaven.aulaJpaMaven.domain.Pessoa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.text.html.parser.Entity;

public class AulaJpaMavenApplication {

	public static void main(String[] args) {


		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();

		Pessoa p = em.find(Pessoa.class, 2);

		System.out.println(p);

		System.out.println("Done!");
		em.close();
		emf.close();
	}

}
