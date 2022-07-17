package app;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entities.Movie;

public class UpdateMovie {
public static void main(String[] args) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("db1Movies");
	EntityManager em=emf.createEntityManager();
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter id: ");
	int id=sc.nextInt();
	
	Movie m= em.find(Movie.class, id);
	if(m!=null) {
		System.out.println("Enter rating: ");
		int rate=sc.nextInt();
		sc.close();
		em.getTransaction().begin();
		m.setRating(rate);
		em.getTransaction().commit();
		System.out.println(m);
	}else {
		System.out.println("No record found");
	}
	
}
}
