package q4;

import java.util.Scanner;

public class Demo {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("How many Student objects need to be created: ");
	int num=scan.nextInt();
	//System.out.println(num);
	Student[] stdArray= new Student[num];
	int AvgMarks=0;
	for(int i=0;i<num;i++) {
		Student s1=new Student();
		System.out.println("Enter Student"+(i+1)+"rollno: ");
		int roll=scan.nextInt();
		s1.setRoll(roll);
		scan.nextLine();
		System.out.println("Enter Student"+(i+1)+"name: ");
		String name=scan.nextLine();
		s1.setName(name);
		//scan.nextLine();
		System.out.println("Enter Student"+(i+1)+"address: ");
		String address=scan.nextLine();
		s1.setAddress(address);
		System.out.println("Enter Student"+(i+1)+"marks: ");
		int marks=scan.nextInt();
		s1.setMarks(marks);
		AvgMarks=AvgMarks+marks;
		stdArray[i]=(s1);
		System.out.println("");
		System.out.println("Student"+(i+1)+"details");
		s1.showDetails();
	}
	scan.close();
	System.out.println("");
	System.out.println("Average marks: "+AvgMarks/num);
	for(int j=0;j<num;j++) {
	System.out.println(stdArray[j]);
	}
}
	

}
