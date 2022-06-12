package q2;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	EmployeeBonus eb1= new EmployeeBonus();
	Scanner s1= new Scanner(System.in);
	System.out.println("Enter DOJ:");
	String doj=s1.next();
	try {
		double bonus=eb1.findBonus(doj);
		System.out.println("bonus:"+bonus);
	} catch (InvalidAge e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	s1.close();
}
}
