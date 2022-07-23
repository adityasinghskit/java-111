package main;

import javax.persistence.EntityManager;

import eMUtil.EMUtil;
import entities.ContractualEmployee;
import entities.Employee;
import entities.SalaryEmployee;

public class Main {
	public static void main(String[] args) {
		EntityManager em=EMUtil.provideEntityManager();
		Employee emp=new Employee();
		emp.setName("Ram");
		SalaryEmployee semp=new SalaryEmployee();
		semp.setName("Kailash");
		semp.setSalary(12500);
		ContractualEmployee cemp= new ContractualEmployee();
		cemp.setName("Seema");
		cemp.setCostPerDay(4000);
		cemp.setNoOfWorkingDays(26);
		
		em.getTransaction().begin();
		//em.persist(emp);
		em.persist(semp);
		em.persist(cemp);
		em.getTransaction().commit();
		em.close();
		System.out.println("done...");
	}

}
