package q1;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Map<String,Student> map= new HashMap<>();
		map.put( "A",new Student(10,"bajdb",80));
		map.put("B",new Student(11,"bajasab",89));
		map.put("C",new Student(8,"daasjdb",90));
		map.put("D",new Student(1,"ba",76));
		//TreeMap<Student,String> tm=(TreeMap)map;
		Set<Map.Entry<String,Student>> kv=map.entrySet();
		//Collections.sort(kv,new SortByMarks());
		//Set<Map.Entry<String, Student>> kv2=Collections.sort(kv,new SortByMarks());
		for(Map.Entry<String,Student> me:kv) {
			System.out.println("City: "+me.getKey()+"="+me.getValue());
		}
		Set<Map.Entry<String,Student>> map2=new TreeSet<>(new SortByMarks());
		for(Map.Entry<String,Student> result: kv) {
			map2.add(result);
		}
		for(Map.Entry<String,Student> result: map2) {
			System.out.println(result.getKey()+"=="+result.getValue());
		}
	}
}
