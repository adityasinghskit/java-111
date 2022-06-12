package q2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s1= new Scanner(System.in);
		UserRegistration u1= new UserRegistration();
		System.out.println("Enter User registration details");
		System.out.println("Username:");
		String name=s1.next();
		System.out.println("Country:");
		String country=s1.next();
		try {
			u1.registerUser(name, country);
		}
		catch(InvalidCountryException ice) {
			System.out.println(ice.getMessage());
		}
		s1.close();
	}
	
	
}