package q3;

class Engine{
int rpm;
int Power;
String manufacturer;
Boolean hasTurbo;
void enableTurbo() {
	this.hasTurbo=true;
}
public static void main(String[] args) {
	Car c1= new Car();
	Engine e1=new Engine();
	e1.rpm=10000;
	e1.Power=110;
	e1.manufacturer="tata";
	e1.enableTurbo();
	Car c2=new Car("Harrier","Tata","black",e1);
	System.out.println("Car Model: "+c2.getM());
	System.out.println("Car Company: "+c2.getC());
	System.out.println("Car color: "+c2.getColor());
	System.out.println("Car RPM: "+c2.getRPM());
	System.out.println("Car power: "+c2.getPower());
	System.out.println("Car Engine Manufacturer: "+c2.getManu());
	System.out.println("Car has turbo: "+c2.getTurbo());
}
}

public class Car {
private String model;
private String companyName;
private String Color;
private Engine engine;
Car(){
	
}
Car(String model, String companyName, String Color,Engine engine){
	this.model=model;
	this.companyName=companyName;
	this.Color=Color;
	this.engine=engine;
}
//getter
public String getM() {
	return this.model;
}
public String getC() {
	return this.companyName;
}
public String getColor() {
	return this.Color;
}
public int getRPM() {
	return this.engine.rpm;
}
public int getPower() {
	return this.engine.Power;
}
public String getManu() {
	return this.engine.manufacturer;
}
public Boolean getTurbo() {
	return this.engine.hasTurbo;
}
}
