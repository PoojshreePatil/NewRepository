import java.util.Scanner;

public class ProductOfDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		      int num,multi=1;
	          Scanner sc = new Scanner(System.in);
	          System.out.println("Enter any number:");
	           num = sc.nextInt();
	           while(num != 0)
	           {
	        	   int rem = num % 10;
	        	   multi = multi * rem;
	        	   num = num / 10;
	           }
	           System.out.println("Product of Digit is: " +multi);
	           sc.close();    
	}

}
