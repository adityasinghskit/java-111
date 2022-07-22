package main;

import javax.persistence.EntityManager;

import emUtil.EmUtil;
import entity.Address;
import entity.Employee;

public class Demo {
	
	public static void main(String[] args) {
		
		EntityManager em= EmUtil.provideEntityManager();
		
		Employee emp1=new Employee();
		emp1.setName("Ram");
		emp1.setGender("Male");
		emp1.setSalary(7800);
		emp1.getAddresses().add(new Address("Maharastra", "pune", "75455","office"));
		Employee emp2=new Employee();
		emp2.setName("Shyam");
		emp2.setGender("Male");
		emp2.setSalary(8800);
		emp2.getAddresses().add(new Address("Rajasthan", "Udaipur", "50455","office"));
		Employee emp3=new Employee();
		emp3.setName("Shyama");
		emp3.setGender("Female");
		emp3.setSalary(9800);
		emp3.getAddresses().add(new Address("Madhya Pradesh", "Indore", "69455","home"));
		Employee emp4=new Employee();
		emp4.setName("Savita");
		emp4.setGender("Female");
		emp4.setSalary(10800);
		emp4.getAddresses().add(new Address("Gujrat", "Navsari", "85455","office"));
		//Address adr=new Address("maharastra", "pune","75455");
		//emp.setAddr(adr);
		
		em.getTransaction().begin();
		
		em.persist(emp1);
		em.persist(emp2);
		em.persist(emp3);
		em.persist(emp4);
		
		em.getTransaction().commit();
		
		System.out.println("done...");
		em.close();
	}

}
