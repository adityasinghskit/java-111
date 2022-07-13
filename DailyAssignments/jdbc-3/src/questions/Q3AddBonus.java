package questions;

import java.util.Scanner;

import employeeDao.EmployeeDao;
import employeeDao.EmployeeDaoImpl;

public class Q3AddBonus {
public static void main(String[] args) {
	EmployeeDao dao = new EmployeeDaoImpl();
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the bonus amount: ");
    int bonus= sc.nextInt();
    sc.close();
    
	try {
		Boolean b=dao.addBonus(bonus);
		if(b)
			System.out.println("Bonus added successfully");
		else
			System.out.println("No records found");
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
}
}
