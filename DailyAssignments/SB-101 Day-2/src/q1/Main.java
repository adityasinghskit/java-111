package q1;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Main {
	public static void main(String[] args) throws Exception{
		Student s1= new Student(122,"Aditya",22);
		FileOutputStream f1= new FileOutputStream("d://abc.txt");
		ObjectOutputStream obj1= new ObjectOutputStream(f1);
		obj1.writeObject(s1);
		obj1.flush();
		obj1.close();
		System.out.println("Success!");
		}
		}