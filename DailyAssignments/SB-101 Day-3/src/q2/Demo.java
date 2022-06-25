package q2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Demo {
public static void main(String[] args) throws ClassNotFoundException, IOException {
	FileInputStream fis= new FileInputStream("student.txt");
	ObjectInputStream ois=new ObjectInputStream(fis);
	Object obj=ois.readObject();
	Student s1=(Student)obj;
	System.out.println(s1);
	System.out.println("Done deserializing...");
}
}
