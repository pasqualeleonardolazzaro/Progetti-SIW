package it.uniroma3.siw.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class ProjectMain {
	
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("products-unit");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();

		em.close();
		emf.close();
	}
	
	//lascio le strategie di fatch standard, mentre per le cascade ho messo cascade persist e delete nella'associazione
	//tra docente e corso in quanto non esiste un corso senza docente stesso ragionamento tra corso e allievi
	
}
