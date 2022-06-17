package q1;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		TreeMap<Student,String> map= new TreeMap<>(new SortByMarks());
		map.put( new Student(10,"bajdb",80),"A");
		map.put(new Student(11,"bajasab",89),"B");
		map.put(new Student(8,"daasjdb",90),"C");
		map.put(new Student(1,"ba",76),"D");
		//TreeMap<String, Student> tm=map.entrySet();
		Set<Map.Entry<Student, String>> kv=map.entrySet();
		//Set<Map.Entry<String, Student>> kv2=Collections.sort(kv,new SortByMarks());
		for(Map.Entry<Student, String> me:kv) {
			System.out.println("City: "+me.getKey()+"="+me.getValue());
		}
	}
}
