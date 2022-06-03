package q2;

public class Citizen {
private String name;
private String aadharNumber;
private String mobileNumber;
public Citizen(){
	
}
public Citizen(String name, String aadharNumber, String mobileNumber) {
	super();
	this.name = name;
	this.aadharNumber = aadharNumber;
	this.mobileNumber = mobileNumber;
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAadharNumber() {
	return aadharNumber;
}
public void setAadharNumber(String aadharNumber) {
	this.aadharNumber = aadharNumber;
}
public String getMobileNumber() {
	return mobileNumber;
}
public void setMobileNumber(String mobileNumber) {
	this.mobileNumber = mobileNumber;
}

}
