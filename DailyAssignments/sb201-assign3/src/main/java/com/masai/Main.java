package com.masai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
public static void main(String[] args) {
	ApplicationContext ctx= new AnnotationConfigApplicationContext(AppConfig.class);
	A a2= ctx.getBean("a1",A.class);
	a2.show();
}
}
