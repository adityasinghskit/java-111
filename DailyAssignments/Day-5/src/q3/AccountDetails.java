package q3;

import java.util.Scanner;

public class AccountDetails {
	public Account getAccountDetails() {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter Account ID: ");
		int id=scan.nextInt();
		System.out.println("Enter Account Type: ");
		String type=scan.next();
		System.out.println("Enter Account Balance: ");
		int bal=scan.nextInt();
		while(bal<=0) {
			System.out.println("Balance should be positive: ");
			bal=scan.nextInt();
		}
		//scan.close();
		Account acc1=new Account();
		acc1.setId(id);
		acc1.setType(type);
		acc1.setBalance(bal);
		return acc1;
	}
	public int getWithdrawAmount() {
		Scanner scan1= new Scanner(System.in);
		System.out.println("Enter amount to be withdrawn: ");
		int amount=scan1.nextInt();
		while(amount<=0) {
			System.out.println("Amount should be positive: ");
			amount=scan1.nextInt();
		}
		//scan1.close();
		return amount;
	} 
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	AccountDetails ad1=new AccountDetails();
	Account a1=ad1.getAccountDetails();
	a1.withdraw(ad1.getWithdrawAmount());
	scanner.close();
}
}
