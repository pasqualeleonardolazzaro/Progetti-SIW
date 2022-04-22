package it.uniroma3.siw.main;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import it.uniroma3.siw.models.Corso;
import it.uniroma3.siw.models.Docente;
import it.uniroma3.siw.models.Società;

public class ProjectMain {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("products-unit");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		
		Società societa = new Società();
		societa.setNumeroDiTelefono(333333333);
		societa.setCap("00142");
		Corso corso1 = new Corso();
		Docente d1 = new Docente();
		d1.setPartitaIva(123);
		List<Corso> corsi = new ArrayList<Corso>();
		d1.setCorsi(corsi);
		
		d1.getCorsi().add(corso1);
		
		
		tx.begin();
		em.persist(societa);
		em.persist(d1);
		em.close();
		tx.commit();
		
		em = emf.createEntityManager();
		TypedQuery<Docente> selectQuery=em.createQuery("SELECT d FROM Docente d", Docente.class);
		List<Docente> docenti = selectQuery.getResultList();
		System.out.println(docenti.toString());
		
		em.close();
		emf.close();
		
	}
	
}
