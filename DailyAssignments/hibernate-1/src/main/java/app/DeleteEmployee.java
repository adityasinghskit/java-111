package app;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entities.Employee;

public class DeleteEmployee {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("db1Employee");
		
		EntityManager em= emf.createEntityManager();
		
	
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter roll to delete ");
		int empid=sc.nextInt();
		sc.close();
		Employee e= em.find(Employee.class, empid);
		
		if(e != null){
			
			em.getTransaction().begin();
			
			em.remove(e);
			
			em.getTransaction().commit();
			
			
			System.out.println("Employee removed....");
			
		}else
			System.out.println("Employee not found...");
		
		em.close();
		
		
		System.out.println("done");
		
		
	}

}
