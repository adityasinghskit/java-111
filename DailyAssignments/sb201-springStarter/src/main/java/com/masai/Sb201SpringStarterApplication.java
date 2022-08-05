package com.masai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Sb201SpringStarterApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(Sb201SpringStarterApplication.class, args);
		A a1= ctx.getBean(A.class, "a");
		a1.funA();
	}

}
