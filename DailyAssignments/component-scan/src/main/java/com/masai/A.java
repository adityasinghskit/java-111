package com.masai;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "a1")
public class A {
	@Autowired
	private B b1;
	
	@PostConstruct
	public void init() {
		System.out.println("Initialisation func..");
	}
	@PreDestroy
	public void destroy() {
		System.out.println("Destroy func..");
	}
	
	public void funA() {
		b1.funB();
		System.out.println("inside funA of A");
	}
}