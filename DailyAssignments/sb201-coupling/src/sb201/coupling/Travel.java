package sb201.coupling;

public class Travel {
Vehical v;

//constructor injection point 
/*public Travel(Vehical v) {
	super();
	this.v = v;
}*/

//setter injection point
public void setV(Vehical v) {
	this.v = v;
}

public void journey() {
	v.go();
	System.out.println("Journey started...");
}
}
