package main;

public class Travel {
Vehical v;
int noOfPerson;


//setter injection point for nop
public void setNoOfPerson(int noOfPerson) {
	this.noOfPerson = noOfPerson;
}
//setter injection point for v
public void setV(Vehical v) {
	this.v = v;
}

public void journey() {
	v.go();
	System.out.println("No of person:"+noOfPerson);
	System.out.println("Journey started...");
}

}
