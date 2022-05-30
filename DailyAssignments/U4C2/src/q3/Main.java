package q3;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner s1= new Scanner(System.in);
	System.out.println("Enter no of passengers: ");
	int no=s1.nextInt();
	System.out.println("Enter no of kms: ");
	int kms=s1.nextInt();
	OLA o1= new OLA();
	Car c1=o1.boookCar(no, kms);
	int fare=o1.calculateBill(c1);
	System.out.println("The total fare: "+fare);
	s1.close();
}
}
