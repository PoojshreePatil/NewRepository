package whilelooping;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {

		   int num,rem=0,rev=0;
	          Scanner sc = new Scanner(System.in);
	          System.out.println("Enter any number:");
	          num = sc.nextInt();
	        
	           while(num>0)
	           {
	        	   rem = num % 10; 
	        	   rev = rev * 10 + rem  ;  
	        	   num = num / 10; 
	           }
	           System.out.println("Reverse Number is :"+rev);
	           sc.close();
	}

}
