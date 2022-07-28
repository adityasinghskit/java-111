package sb201.coupling;

public class Car implements Vehical {
	public void start() {
		System.out.println("Car started...");
	}
	@Override
	public void go() {
		start();
		
	}

}
