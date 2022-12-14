package writtenloops;

import java.util.Scanner;

public class ProductOfDigit {

	public static void main(String[] args) {

		int num,product=1,rem=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
	    num = sc.nextInt();
	    while(num != 0)
	    {
	    	rem = num % 10;
	    	product = product * rem;
	    	num =num / 10;
	    }
	    System.out.println("Sum Of Digit is:" + product);
	    sc.close();
	}

}
