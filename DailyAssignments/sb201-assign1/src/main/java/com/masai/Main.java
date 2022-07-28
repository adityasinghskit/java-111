package com.masai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
public static void main(String[] args) {
	ApplicationContext ctx= new ClassPathXmlApplicationContext("applicationContext.xml");
	Drawing dwr= ctx.getBean(Drawing.class, "d");
	dwr.drawShape();
}
}
