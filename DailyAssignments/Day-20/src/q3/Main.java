package q3;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Main {
public static void main(String[] args) {
	List<Student> ls=new ArrayList<>();
	ls.add(new Student(10, "Raj", 79));
	ls.add(new Student(33, "Aditya", 89));
	ls.add(new Student(12, "Vishal", 59));
	ls.add(new Student(9, "Diksha", 29));
	ls.add(new Student(1, "Manoj", 99));
	
Stream<Student> str1=ls.stream();
List<Employee> emp=ls.stream()
					  .map(s -> new Employee(s.getRoll(),s.getName(),s.getMarks()*1000))
					  .collect(Collectors.toList());
for(Employee e: emp) {
	System.out.println(e);
}
}
}
