package q1;

public class AccountDemo {
public static void main(String[] args) {
	double bal;
	try {
	Account a1= new Account("12345");
	a1.deposit(3000);
	bal= a1.withdraw(4000);
	System.out.println("Remaining balance is "+bal);
	}
	catch(InsufficientFundsException ife) {
		System.out.println(ife.getMessage());
	}
	
	
}
}
