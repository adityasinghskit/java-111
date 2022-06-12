package q1;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Main {
	public void getAge(String dob) throws InvalidDateFormat {
		DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd/MM/yyyy");
		try {
		LocalDate ld=LocalDate.parse(dob,dtf);
		LocalDate today=LocalDate.now();
		Period diff=Period.between(ld, today);
		int years=diff.getYears();
		if(years<0) {
			System.out.println("Date should not be in Future");
		}else {
		System.out.println("Age:"+years);
		}
		}
		catch(DateTimeParseException dtp) {
			System.out.println(dtp.getMessage());
			InvalidDateFormat idf= new InvalidDateFormat("Enter date in correct format");
			throw idf;
		}
		
	}
	public static void main(String args[]) {
		//String dob="05/02/1985";
		Scanner s1= new Scanner(System.in);
		System.out.println("Enter the date:");
		String date=s1.next();
		Main m1= new Main();
		try {
			m1.getAge(date);
		} catch (InvalidDateFormat e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		s1.close();
		}
}
