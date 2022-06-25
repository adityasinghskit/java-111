package q2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {
public static void main(String[] args) throws IOException {
	Student s1= new Student(12,"Aditya",new Address("RAJ","Ajmer","305001")
	,"abc@xyz.com","1234");
	FileOutputStream fos1= new FileOutputStream("student.txt");
	ObjectOutputStream obj= new ObjectOutputStream(fos1);
	obj.writeObject(s1);
	obj.close();
	System.out.println("Done serializing...");
	
}
}
