package com.masai;

public class PresentationBean {
	private ServiceBean service;

	//Injector setter method
	public void setService(ServiceBean service) {
		this.service = service;
	}
	public void end() {
		System.out.println("Destroy method...");
	}
	public void present() {
		service.calculateInterest();
		System.out.println("Pesenting the calculated interesest in PL");
	}
}
