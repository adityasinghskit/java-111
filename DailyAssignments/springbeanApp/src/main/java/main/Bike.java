package main;

public class Bike implements Vehical{
	public void ride() {
		System.out.println("ride started...");
	}
	@Override
	public void go() {
		ride();
		
	}

}
