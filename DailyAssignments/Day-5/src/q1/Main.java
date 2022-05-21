package q1;

import java.util.Scanner;

public class Main {
	/*public static Employee getEmployeeDetails() {
		System.out.println("Employee id: "+employeeId);
		
	}*/
	public static Employee getEmployeeDetails() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter employee id: ");
		int id=scan.nextInt();
		scan.nextLine();
		System.out.println("Enter employee name: ");
		String name=scan.nextLine();
		System.out.println("Enter employee salary: ");
		double salary=scan.nextDouble();
		//scan.close();
		Employee emp=new Employee();
		emp.setId(id);
		emp.setName(name);
		emp.setSalary(salary);
		return emp;
	}
	public static int getPFPercentage() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter PF percentage: ");
		int pf=scan.nextInt();
		//scan.close();
		return pf;
	}
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		Employee e1=getEmployeeDetails();
		int pf1=getPFPercentage();
		e1.calculateNetSalary(pf1);
		e1.showDetails();
		scanner.close();
    }
}
