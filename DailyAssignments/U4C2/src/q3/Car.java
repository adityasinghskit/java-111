package q3;

public class Car {
private int numberOfPassenger;
private int numberOfKms;
int farePerKm;
public Car() {
	
}
public int getNumberOfPassenger() {
	return numberOfPassenger;
}
public void setNumberOfPassenger(int numberOfPassenger) {
	this.numberOfPassenger = numberOfPassenger;
}
public int getNumberOfKms() {
	return numberOfKms;
}
public void setNumberOfKms(int numberOfKms) {
	this.numberOfKms = numberOfKms;
}

}
class Sedan extends Car{
	final int farePerKm= 20;
	
}
class HachBack extends Car{
	final int farePerKm= 15;
	
}
class OLA {
	public Car boookCar(int numberOfPassenger, int numberOfKms) {
		if(numberOfPassenger<=3) {
			HachBack h1= new HachBack();
			h1.setNumberOfKms(numberOfKms);
			h1.setNumberOfPassenger(numberOfPassenger);
			return h1;
		}else {
			Sedan h1= new Sedan();
			h1.setNumberOfKms(numberOfKms);
			h1.setNumberOfPassenger(numberOfPassenger);
			return h1;
		}
	}
	public int calculateBill(Car car) {
		return car.getNumberOfKms()* car.farePerKm;
	}
}