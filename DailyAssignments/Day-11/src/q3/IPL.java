package q3;

import java.util.Scanner;

public class IPL {
	public void homeTeamStadium(Stadium stadium) {
		Stadium[] s1= Stadium.values();
		if(stadium.equals(s1[0])) {
			System.out.println("This is home to KKR");
		}else if(stadium.equals(s1[1])) {
			System.out.println("This is home to MI");
		}else if(stadium.equals(s1[2])) {
			System.out.println("This is home to CSK");
		}else {
			System.out.println("This is home to RCB");
		}
		
	}
	//@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		Scanner s1= new Scanner(System.in);
		Stadium[] s2= Stadium.values();
		System.out.println("Enter the stadium: ");
		String str=s1.next();
		
		try {
			if(Stadium.valueOf(str) instanceof Stadium) {
				IPL i1= new IPL();
				i1.homeTeamStadium(Stadium.valueOf(str));
			}
		}
		catch(IllegalArgumentException e) {
			
				System.out.println("Don't know!");
		}
		
		s1.close();
	}
}
