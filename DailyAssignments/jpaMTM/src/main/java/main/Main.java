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
		e1.getDept().add(d1);
		Employee e2=new Employee();
		e2.setEname("B");
		e2.setAddress("cityB");
		e2.setSalary(9900);
		e2.getDept().add(d1);
		Employee e3=new Employee();
		e3.setEname("C");
		e3.setAddress("cityC");
		e3.setSalary(10900);
		e3.getDept().add(d2);
		d1.getEmployees().add(e1);
		d1.getEmployees().add(e2);
		d2.getEmployees().add(e3);
		
		em.getTransaction().begin();
		em.persist(d1);
		em.persist(d2);
		em.getTransaction().commit();
		em.close();
		System.out.println("done...");
	}

}
