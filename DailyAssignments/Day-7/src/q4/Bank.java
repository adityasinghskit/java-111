package q4;

public class Bank {
private String branchName;
private String ifscCode;

public String getBranchName() {
	return branchName;
}

public void setBranchName(String branchName) {
	this.branchName = branchName;
}

public String getIfscCode() {
	return ifscCode;
}

public void setIfscCode(String ifscCode) {
	this.ifscCode = ifscCode;
}
public Bank() {
	
}
public Bank(String name, String ifsc) {
	this.branchName=name;
	this.ifscCode=ifsc;
}

public void displayDetails() {
	System.out.println("Bank details: ");
	System.out.println("Branch name: "+this.getBranchName());
	System.out.println("IFSC code: "+this.getIfscCode());
	System.out.println("=================================");
}
}
class ICICIBank extends Bank {
	double rateOfInterest;
	@Override
	public void displayDetails() {
		System.out.println("Bank details: ");
		System.out.println("Branch name: "+this.getBranchName());
		System.out.println("IFSC code: "+this.getIfscCode());
		System.out.println("IFSC code: "+this.rateOfInterest);
		System.out.println("=================================");
	}
}
class AxisBank extends Bank {
	double rateOfInterest;
	@Override
	public void displayDetails() {
		System.out.println("Bank details: ");
		System.out.println("Branch name: "+this.getBranchName());
		System.out.println("IFSC code: "+this.getIfscCode());
		System.out.println("IFSC code: "+this.rateOfInterest);
		System.out.println("=================================");
	}
	public void getCreditCard() {
		System.out.println("Get the credit card from the axis bank");
		
	}
}

