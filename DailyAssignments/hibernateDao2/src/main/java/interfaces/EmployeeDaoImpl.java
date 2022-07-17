package interfaces;

import java.util.List;

import javax.persistence.EntityManager;

import emUtil.EmUtil;
import entity.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	public boolean createEmployee(Employee emp) {
		boolean flag=false;
		EntityManager em=EmUtil.provideEntityManager();
		em.getTransaction().begin();
		em.persist(emp);
		flag=true;
		em.getTransaction().commit();
		em.close();
		return flag;
	}

	public String getAddressOfEmployee(int id) {
		String m=null;
		EntityManager em=EmUtil.provideEntityManager();
		Employee emp=em.find(Employee.class, id);
		m=emp.getAddress();
		
		return m;
	}

	public boolean deleteEmployee(int id) {
		boolean flag=false;
		EntityManager em=EmUtil.provideEntityManager();
		Employee m=em.find(Employee.class, id);
		if(m!=null) {
			em.getTransaction().begin();
			em.remove(m);
			flag=true;
			em.getTransaction().commit();
			
		}
			
		return flag;
	}

	public String giveBonusToEmployee(int empId, int bonus) {
		String str=null;
		EntityManager em=EmUtil.provideEntityManager();
		Employee emp=em.find(Employee.class, empId);
		em.getTransaction().begin();
		emp.setSalary(emp.getSalary()+bonus);
		str="Salary after bonus: "+emp.getSalary();
		em.getTransaction().commit();
		
		return str;
	}
	 public List<Employee> getAllEmployee(){
		 List<Employee> list=null;
		 
				 return list;
	 }
	 public String[] getNameAndAddress(int empId) {
		 String[] str=new String[2];
		 EntityManager em=EmUtil.provideEntityManager();
		 Employee emp=em.find(Employee.class, empId);
		 if(emp!=null) {
			 str[0]= emp.getName();
			 str[1]=emp.getAddress();
		 }else {
			 str[0]= null;
			 str[1]=null;
		 }
			 
		 return str;
	 }
		 
	 
}
