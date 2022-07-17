package app;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entities.Movie;

public class GetMovie {
	public static void main(String[] args) {
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("db1Movies");
		EntityManager em=emf.createEntityManager();
		
		Scanner sc= new Scanner(System.in);
		System.out.println("ENter id: ");
		int id=sc.nextInt();
		sc.close();
		Movie m1= em.find(Movie.class, id);
		if(m1!=null)
		System.out.println(m1);
		else 
		System.out.println("No record found!");
		
	}
	
	
}
