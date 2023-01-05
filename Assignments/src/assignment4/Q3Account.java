package assignment4;

public class Q3Account {

	/*
	   3. Create default constructor assign new value to all variables and write “ I 
	   am in default Constructor
	
	   4. In main, create another object of the Account class and print the member
	   variables value. (Note – Since you have defined a (default) constructor, Java
	   does not provide another one)
	 
	  5. Define a constructor which takes all arguments and assigns those values to 
        the instance variables and write “I am in parameterized constructor”
      6. In main, to create another object of the Account class using the constructor 
        with all arguments and print the instance variable values.
	*/
	
	long accountNo;
	String customerName;
	
	Q3Account()
	{
		accountNo = 24512563;
		customerName = "Poojshree";
		
		System.out.println("I am Default Constructor");
	}
	
	Q3Account(long accno,String cnm )
	{
		accountNo = accno;
		customerName = cnm;
		
		System.out.println("I am Parametrized Constructor");
	}
	
	public static void main(String[] args) {

		Q3Account a = new Q3Account();
		
		System.out.println("Account Number:"+a.accountNo);
		System.out.println("Costomer name:"+a.customerName);
		
        Q3Account a1 = new Q3Account();
		
		System.out.println("Account Number:"+a1.accountNo);
		System.out.println("Costomer name:"+a1.customerName);
		
		Q3Account a2 = new Q3Account(1346326525,"Shree");
		
		System.out.println("Account Number:"+a2.accountNo);
		System.out.println("Costomer name:"+a2.customerName);
	}

}
