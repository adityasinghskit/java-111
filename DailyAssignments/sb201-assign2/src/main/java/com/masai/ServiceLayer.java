package com.masai;

public class ServiceLayer {
	//Initialisation method
	public void init() {
		System.out.println("Init func..");
	}
	
	public int sum(int a, int b) {
		return a+b;
	}
	public int diff(int a, int b) {
		return a-b;
	}
	public int mul(int a,int b) {
		return a*b;
	}
	public int div(int a, int b) {
		return a/b;
	}
}
