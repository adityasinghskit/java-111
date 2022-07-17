package app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entities.Movie;

public class InsertMovie {
	public static void main(String[] args) {
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("db1Movies");
		EntityManager em= emf.createEntityManager();
		
		Movie m1= new Movie(1,"Kaal",2001,7);
		
		em.getTransaction().begin();
		em.persist(m1);
		em.getTransaction().commit();
		System.out.println("Movie added");
	}
}
