package main;

import javax.persistence.EntityManager;

import eMUtil.EMUtil;
import entities.Department;
import entities.Employee;

public class Main {
	public static void main(String[] args) {
		EntityManager em=EMUtil.provideEntityManager();
		Department d1=new Department();
		d1.setDname("Sales");
		d1.setLocation("Gurgaon");
		Department d2= new Department();
		d2.setDname("IT");
		d2.setLocation("Banglore");
		Employee e1=new Employee();
		e1.setEname("A");
		e1.setAddress("cityA");
		e1.setSalary(8900);
		Employee e2=new Employee();
		e2.setEname("B");
		e2.setAddress("cityB");
		e2.setSalary(9900);
		d1.setEmployee(e1);
		d2.setEmployee(e2);
		e1.setDept(d1);
		e2.setDept(d2);
		
		em.getTransaction().begin();
		em.persist(d1);
		em.persist(d2);
		em.getTransaction().commit();
		em.close();
		System.out.println("done...");
	}

}
