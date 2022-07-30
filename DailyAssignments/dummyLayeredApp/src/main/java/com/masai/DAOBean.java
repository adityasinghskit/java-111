package com.masai;

public class DAOBean {
	public void init() {
		System.out.println("Init method...");
	}
	public void findAccount() {
		// taking jdbc or ORM approcah to get the account info from the DB
		System.out.println("Account details feteched and given by DAO Bean of DAL");
	}
}
