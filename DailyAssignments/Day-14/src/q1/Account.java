package q1;

public class Account {
	String accountNumber;
	double balance;
	public Account() {
	}
	public Account(String accountNo) {
		this.accountNumber=accountNo;
		this.balance=0.00;
	}
	void deposit(int amount) {
		this.balance=this.balance+amount;
	}
	double withdraw(int amount) throws InsufficientFundsException {
		if(this.balance>=amount) {
			this.balance=this.balance-amount;
			return this.balance;
		}else {
			InsufficientFundsException ife= new InsufficientFundsException("Insufficient funds to make the transaction");
			throw ife;
			
		}
		
	}
	
}
