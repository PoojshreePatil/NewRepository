package assignment4;

public class Q1Account {

	/*
	 1. Create a class Account with member Variable: long accountNo, String
	  customerName,
	 2. In main, create a new object of the Account class and print the instance 
        variables value.
        (Note – Default constructor is provided by Java to facilitate the creation of a 
         new object, here variables are assigned default values)
	*/
	
	long accountNo;
	String customerName;
	
	Q1Account()
	{
		
	}
	public static void main(String[] args) {

		Q1Account a = new Q1Account();
	
		System.out.println("Account Number:"+a.accountNo);
		System.out.println("Costomer name:"+a.customerName);
	}
	

}
