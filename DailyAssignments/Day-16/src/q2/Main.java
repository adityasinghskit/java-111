package q2;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
public static void main(String[] args) {
	Scanner s1= new Scanner(System.in);
	System.out.println("Enter employee deatils");
	TreeSet<Employee> ts= new TreeSet<>(new SortBySalary());
	for(int i=1;i<=4;i++) {
		System.out.println("Employee"+(i)+" details");
		System.out.println("empID:");
		int id=s1.nextInt();
		System.out.println("empName:");
		String name=s1.next();
		System.out.println("salary:");
		double salary=s1.nextDouble();
		ts.add(new Employee(id,name,salary));
	}
	s1.close();
	System.out.println("Employees:");
	for(Employee e: ts) {
		System.out.println("Employee ID: "+e.getEmpId());
		System.out.println("Employee Name: "+e.getEmpName());
		System.out.println("Employee Salary: "+e.getSalary());
		System.out.println("=======================");
	}
	/*Iterator<Employee> itr = ts.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}*/
	
}
}
