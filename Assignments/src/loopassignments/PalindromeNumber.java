package loopassignments;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {

		   int num,rem=0,rev=0;
	          Scanner sc = new Scanner(System.in);
	          System.out.println("Enter any number:");
	          num = sc.nextInt();
	          int temp = num;
	           while(num>0)
	           {
	        	   rem = num % 10; 
	        	   rev = rev * 10 + rem  ;  
	        	   num = num / 10; 
	           }
	           if(temp == rev)
	           {
	        	   System.out.println("Number is Palindrome : " +rev);
	           }
	           else
	           {
	        	   System.out.println("Number is not Palindrome : " +rev); 
	           }
	           sc.close();    
	}

}
