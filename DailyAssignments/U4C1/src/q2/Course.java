package q2;

import java.util.Scanner;

public class Course {
int courseId;
String courseName;
int courseFee;
void displayCourseDetails() {
	System.out.println("Course Details");
	System.out.println("ID: "+courseId);
	System.out.println("Name: "+courseName);
	System.out.println("Fee: "+courseFee);
}
static void authenticate(String username, String password) {
	if(username.equals("Admin") && password.equals("1234")) {
		Course c1= new Course();
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter courseId: ");
		c1.courseId=s1.nextInt();
		s1.nextLine();
		System.out.println("Enter courseName: ");
		c1.courseName=s1.next();
		System.out.println("Enter courseFee: ");
		c1.courseFee=s1.nextInt();
		c1.displayCourseDetails();
		
	}
	else {
		System.out.println("Invalid Username or password");
	}
}
public static void main(String[] args) {
	Scanner scan= new Scanner(System.in);
	authenticate("Admin", "1234");
	scan.close();
}
}
