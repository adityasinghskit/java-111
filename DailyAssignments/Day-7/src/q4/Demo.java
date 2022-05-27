package q4;

import java.util.Scanner;

public class Demo {
	public static Bank getBank(String bank) {
		
			Scanner s1=new Scanner(System.in);
			System.out.println("Enter Branch Name: ");
			String name=s1.next();
			System.out.println("Enter Branch IFSC: ");
			String ifsc=s1.next();
		if(bank=="icici") {
			ICICIBank b1=new ICICIBank();
			b1.setBranchName(name);
			b1.setIfscCode(ifsc);
			b1.rateOfInterest=4.2;
			return b1;
		}else if(bank=="axis") {
			AxisBank b1=new AxisBank();
			b1.setBranchName(name);
			b1.setIfscCode(ifsc);
			b1.rateOfInterest=3.8;
			b1.getCreditCard();
			return b1;
		}else 
			return null;
		
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		//System.out.println("Enter bank Name: ");
		//String bank=scan.next();
		//Bank b2=getBank(bank);
		Bank b2=getBank("axis");
		b2.displayDetails();
		scan.close();
	}
}
