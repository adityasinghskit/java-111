package q3;

public class Account {
private int accountId;
private String accountType;
private int balance;

Account(){
	
}
//getter
public int getId() {
	return this.accountId;
}
public String getType() {
	return this.accountType;
}
public int getBalance() {
	return this.balance;
}
//setter
public void setId(int i) {
	this.accountId=i;
}
public void setType(String t) {
	this.accountType=t;
}
public void setBalance(int b) {
	this.balance=b;
}
public boolean withdraw(int a) {
	int bal=this.getBalance();
	if(bal>=a) {
		System.out.println("Balance amount after withdraw: "+(bal-a));
		return true;
	}else {
		System.out.println("Sorry!!Not enought balance.");
		return false;
	}
}
}
