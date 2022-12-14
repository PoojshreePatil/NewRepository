package gettersetter;

import java.util.Scanner;

public class GooglePay {

	int amount;

	void withdraw(int amount, Account acc) {
		int accbal = acc.getBalance();
		if (accbal > amount) {
			accbal = accbal - amount;
			acc.setBalance(accbal);
		} else
			System.out.println("Low Balance!!! try after some time...");

	}

	void deposit(int depositamt, Account acc) {
		int accbal = acc.getBalance();
		accbal = accbal + depositamt;
		acc.setBalance(accbal);
	}

	public static void main(String[] args) {

		
		Account a1 = new Account();
		a1.setId(1);
		a1.setAccno(789562442);
		a1.setBalance(20000);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount to withdraw: ");
		int amount = sc.nextInt();
		
		GooglePay g = new GooglePay();
		g.withdraw(amount,a1);
		
		System.out.println("Amount Withdrawn; Total Amount:"+a1.getBalance());
		
		
		  Account a2 = new Account();
		  a2.setId(2);
		  a2.setAccno(743562442);
		  a2.setBalance(30000);
		 
		  System.out.println("Enter the Deposit Amount:");
		  int depositamt =sc.nextInt();
		  g.deposit(depositamt, a2);
		  System.out.println("Amount Deposited; Total Amount:"+a2.getBalance());
		  
		 
	}	
	
}










/*
 * System.out.println("Enter the Deposit Amount:"); int depositamt
 * =sc.nextInt(); g.deposit(depositamt, a1);
 * System.out.println("Amount Deposited; Total Amount:"+a1.getBalance());
 * 
 */

