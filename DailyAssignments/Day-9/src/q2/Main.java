package q2;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	Parent p1 = new Child();
	System.out.println("Enter a no between 1 to 10");
	int no=scan.nextInt();
	if(no>=1 && no<=10) {
		p1.number=no;
		p1.method1();
	}else {
		System.out.println("Invalid Number");
	}
	
}
}
