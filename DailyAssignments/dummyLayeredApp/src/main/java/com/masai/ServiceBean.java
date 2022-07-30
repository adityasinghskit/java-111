package com.masai;

public class ServiceBean {
	private DAOBean dao;
	
	//Injector setter method
	public void setDao(DAOBean dao) {
		this.dao = dao;
	}

	public void calculateInterest() {
		dao.findAccount();
		System.out.println("Interest calculated in Service Layer..");
	}
}
