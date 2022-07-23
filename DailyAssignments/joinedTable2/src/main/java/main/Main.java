package main;

import javax.persistence.EntityManager;

import eMUtil.EMUtil;
import entities.Address;
import entities.Employee;
import entities.Person;

public class Main {
	public static void main(String[] args) {
		EntityManager em=EMUtil.provideEntityManager();
		Employee e1= new Employee();
		e1.setName("Anil");
		e1.setHomeAddress(new Address("A", "cityA", "51234"));
		e1.setOfficeAddress(new Address("B", "cityB", "55555"));
		e1.setSalary(12000);
		Employee e2= new Employee();
		e2.setName("Ajeet");
		e2.setHomeAddress(new Address("C", "cityC", "59934"));
		e2.setOfficeAddress(new Address("D", "cityD", "50855"));
		e2.setSalary(12008);
		Employee e3= new Employee();
		e3.setName("Sunita");
		e3.setHomeAddress(new Address("E", "cityE", "89934"));
		e3.setOfficeAddress(new Address("F", "cityF", "99855"));
		e3.setSalary(22008);
		Employee e4= new Employee();
		e4.setName("Madhuri");
		e4.setHomeAddress(new Address("G", "cityG", "54434"));
		e4.setOfficeAddress(new Address("H", "cityH", "77855"));
		e4.setSalary(12998);
		em.getTransaction().begin();
		em.persist(e1);
		em.persist(e2);
		em.persist(e3);
		em.persist(e4);
		em.getTransaction().commit();
		em.close();
		System.out.println("done...");
	}

}
