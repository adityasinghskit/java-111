package app;


import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entities.Employee;

public class GiveBouns {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("db1Employee");
		EntityManager em=emf.createEntityManager();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter employee empid: ");
		int id=sc.nextInt();
		
		Employee e=em.find(Employee.class, id);
		if(e!=null) {
			System.out.println("ENter the bonus amount: ");
			int bonus=sc.nextInt();
			em.getTransaction().begin();
			e.setSalary(e.getSalary()+bonus);
			em.getTransaction().commit();
			System.out.println("Bonus added.");
		}else {
			System.out.println("No record found!");
		}
		em.close();
		sc.close();
	}

}
