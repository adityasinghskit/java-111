package q1;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Demo {
	public static void main(String[] args) throws Exception{
		FileInputStream fis=new FileInputStream("d://abc.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Object o1= ois.readObject();
		Student s1=(Student)o1;
		System.out.println(s1);
		ois.close();
		}
		}