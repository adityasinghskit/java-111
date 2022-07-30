package com.masai2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {
public static void main(String[] args) {
	ApplicationContext ctx= new AnnotationConfigApplicationContext(AppConfig2.class);
	PresentationBean pb1=ctx.getBean(PresentationBean.class,"pbean");
	pb1.cal();
}
}
