package classesandobject;

import java.util.Scanner;

public class Account {

	int balace;
	String accountno;
	float balance,depositamt,withdrawamount;
	String username;
	
	
	void insert()
	{
		System.out.println("Insert the Account Details: ");
//		System.out.println("Enter the accountno:");
//		accountno = sc.next();
//		System.out.println("Enter Username:");
//		username = sc.next();
//		System.out.println("Enter the balance:");
//		balance =sc.nextFloat();
	}
	
	void display()
	{
		System.out.println("********Account Details********");
		System.out.println("Account Number:"+accountno);
		System.out.println("Account holder name:"+username);
		System.out.println("Account Balnce:"+balance);
	}
	void deposit()
	{
		System.out.println("The deposit value:"+depositamt);
		//depositamt = sc.nextFloat();
	}
	void withdraw()
	{
		System.out.println("the Withdraw Amount:"+withdrawamount);
		//withdrawamount =sc.nextFloat();
	}
	void check_balance()
	{
		balance = balance + depositamt - withdrawamount;
		System.out.println("Total balance: "+balance);
	}
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the accountno:");
		String accountno = sc.next();
		System.out.println("Enter Username:");
		String username = sc.next();
		System.out.println("Enter the balance:");
		float balance =sc.nextFloat();
		System.out.println("Enter the deposit value:");
		float depositamt = sc.nextFloat();
		System.out.println("Enter the Withdraw Amount:");
		float withdrawamount =sc.nextFloat();
		Account a = new Account();
		a.insert();
		a.display();
		a.deposit();
		a.withdraw();
		a.check_balance();
		
	}

}
