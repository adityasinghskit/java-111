package main;

import javax.persistence.EntityManager;

import emUtil.EmUtil;
import entity.Address;
import entity.Employee;

public class Demo {
	
	public static void main(String[] args) {
		
		EntityManager em= EmUtil.provideEntityManager();
		
		Employee emp=new Employee();
		emp.setName("Ram");
		emp.setGender("Male");
		emp.setSalary(7800);
		emp.setAddr(new Address("Maharastra", "pune", "75455","office"));
		
		
		//Address adr=new Address("maharastra", "pune","75455");
		//emp.setAddr(adr);
		
		em.getTransaction().begin();
		
		em.persist(emp);
		
		em.getTransaction().commit();
		
		System.out.println("done...");
		em.close();
	}

}
