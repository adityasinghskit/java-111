package app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entities.Employee;

public class InsertEmployee {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("db1Employee");
		
		EntityManager em= emf.createEntityManager();
		
		Employee s=new Employee(6, "F", "cityF",10200);
		
	/*	EntityTransaction et= em.getTransaction();
		
		et.begin();
		
		em.persist(s);
		
		et.commit();
	*/	
	
		em.getTransaction().begin();
		
		em.persist(s);
		
		em.getTransaction().commit();
		
		em.close();
		
		System.out.println("done");
		
		
	}

}
