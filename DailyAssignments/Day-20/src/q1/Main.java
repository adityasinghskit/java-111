package q1;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
public static void main(String[] args) {
	List<Student> list= new ArrayList<>();
	list.add(new Student(10,"A",770));
	list.add(new Student(11,"B",870));
	list.add(new Student(12,"C",370));
	list.add(new Student(13,"D",570));
	list.add(new Student(14,"E",970));
	
	List<Student> listFinal=list.stream()
								.filter(s -> s.getMarks()<800)
								.collect(Collectors.toList());
	
	for(Student s: listFinal) {
		System.out.println(s);
	}
	
	/*Stream<Student> str=list.stream();
	
	str.filter(s -> s.getMarks()>800)
	.forEach(s -> System.out.println(s));*/
}

}
