package assignment4;

public class Q7Account {

	/*
	  7. In main method, create 2 Account objects with different account numbers
	  and names and print the values of all the member variables of both the
	  accounts. 
	  */
	 
	 
	public static void main(String[] args) {

        Q3Account a3 = new Q3Account(726578566,"Yash");
		
		System.out.println("Account Number:"+a3.accountNo);
		System.out.println("Costomer name:"+a3.customerName);
		
        Q3Account a4 = new Q3Account(911298927,"Raj");
		
		System.out.println("Account Number:"+a4.accountNo);
		System.out.println("Costomer name:"+a4.customerName);
	}

}
