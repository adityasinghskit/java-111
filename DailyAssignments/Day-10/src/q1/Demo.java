package q1;

import java.util.Scanner;

public class Demo {
public Hotel provideFood(int amount) {
	if(amount>200 && amount<=1000) {
		return new RoadSideHotel();
	}else  {
		return new TajHotel();
	}
}
public static void main(String[] args) {
	Scanner scan= new Scanner(System.in);
	Demo d1=new Demo();
	System.out.println("Enter the amoount for food: ");
	int amount=scan.nextInt();
	if(amount>200) {
		Hotel h1=d1.provideFood(amount);
		if(h1 instanceof TajHotel) {
			TajHotel t1=(TajHotel)h1;
			t1.welcomeDrink();
			t1.chickenBiryani();
			t1.masalaDosa();
			
		}else {
			RoadSideHotel r1=(RoadSideHotel)h1;
			r1.chickenBiryani();
			r1.masalaDosa();
		}
	}else {
		System.out.println("Enter valid amount greater than 200.");
	}
	scan.close();
	
}
}
