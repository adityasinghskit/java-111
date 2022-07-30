package com.masai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo {
public static void main(String[] args) {
	ApplicationContext ctx= new AnnotationConfigApplicationContext(AppConfig.class);
	A a2= ctx.getBean(A.class, "a1");
	a2.funA();
	AnnotationConfigApplicationContext ctx2=(AnnotationConfigApplicationContext)ctx;
	ctx2.close();
}
}
