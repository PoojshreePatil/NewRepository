package whilelooping;

import java.util.Scanner;

public class SumOfDigit {

	public static void main(String[] args) {
		long sum=0,rem=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
	    long num = sc.nextLong();
	    while(num != 0)
	    {
	    	rem = num % 10;
	    	sum = sum + rem;
	    	num =num / 10;
	    }
	    System.out.println("Sum Of Digit is:" + sum);
	    sc.close();
	}

}
