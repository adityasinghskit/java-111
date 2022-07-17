package app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entities.Employee;

public class GetEmployeeById {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("db1Employee");
		EntityManager em= emf.createEntityManager();
		
		Employee e= em.find(Employee.class, 1);
	
		if(e != null) {
			//em.clear();
			/*em.getTransaction().begin();
			e.setSalary(8111);
			
			em.getTransaction().commit();*/
			System.out.println(e);
		}
		else
			System.out.println("Employee does not exit..");
		 
		em.close();
		
	}

}

