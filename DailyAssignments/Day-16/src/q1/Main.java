package q1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner s1= new Scanner(System.in);
	System.out.println("Enter Product info:");
	ArrayList<Product> al=new ArrayList<>();
	for(int i=0;i<4;i++) {
		System.out.println("Enter product"+i+1+"info");
		System.out.println("ID:");
		int id=s1.nextInt();
		System.out.println("Name:");
		String name=s1.next();
		System.out.println("Price:");
		double price=s1.nextDouble();
		Product p1= new Product(id,name,price);
		al.add(p1);
	}
	System.out.println("Enter sorting choice");
	int choice=s1.nextInt();
	if(choice==1) {
		for(Product p: al) {
			System.out.println(p.);
		}
	}
	s1.close();
	
}
}
