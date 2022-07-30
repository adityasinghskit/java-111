package com.masai;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@ComponentScan(basePackages="com.masai")
@PropertySource("a1.properties")
public class AppConfig {
@Autowired
private Environment env;

@Bean("clist")
public List<String> getCities(){
	List<String> cities = new ArrayList<String>();
	cities.add(env.getProperty("city1"));
	cities.add(env.getProperty("city2"));
	cities.add(env.getProperty("city3"));
	cities.add(env.getProperty("city4"));
	cities.add(env.getProperty("city5"));
	return cities;
}
@Bean("slist")
public List<Student> getStudents(){
	List<Student> students= new ArrayList<Student>();
	students.add(new Student("A",1,80));
	students.add(new Student("B",2,90));
	students.add(new Student("C",3,70));
	students.add(new Student("D",4,60));
	students.add(new Student("E",5,50));
	return students;
}
@Bean("map")
public Map<Student, String> getMap(){
	Map<Student, String> map= new HashMap<Student, String>();
	map.put(new Student("A",1,80), "city1");
	map.put(new Student("B",2,90), "city2");
	map.put(new Student("C",3,70), "city3");
	return map;
}
}
