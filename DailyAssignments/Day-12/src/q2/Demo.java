package q2;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Demo {
	public boolean validate(String name, String mobileNum, String aadharCard) {
		boolean n=Pattern.matches("[a-zA-Z]{3,8}", name);
		boolean a=Pattern.matches("\\d{12}", aadharCard);
		boolean m=Pattern.matches("[6789]\\d{9}",mobileNum);
		
		if(n==true && a==true && m==true) {
			return true;
		}else {
			return false;
		}
	}
	public static void main(String[] args) {
		Scanner s1= new Scanner(System.in);
		System.out.println("Enter details: ");
		System.out.println("Enter name:");
		String name=s1.next();
		System.out.println("Enter mobile:");
		String mobile=s1.next();
		System.out.println("Enter aadhar:");
		String aadhar=s1.next();
		Demo d1= new Demo();
		
		if(d1.validate(name, mobile, aadhar)) {
			Citizen c1= new Citizen(name, aadhar, mobile);
			System.out.println("Citizen details: ");
			System.out.println("Name: "+c1.getName());
			System.out.println("Aadhar: "+c1.getAadharNumber());
			System.out.println("Mobile: "+c1.getMobileNumber());
			
		}else {
			System.out.println("Enter valid details.");
		}
		s1.close();
	}
}
