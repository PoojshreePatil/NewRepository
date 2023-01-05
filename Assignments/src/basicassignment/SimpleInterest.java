package basicassignment;

import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {

		double principalamount = 0,rate =0;
		double time = 0,interest = 0;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the Principal Amount:");
		principalamount = sc.nextDouble();
		System.out.println("Enter the interest rate(per year):");
		rate = sc.nextDouble();
		System.out.println("Enter the time(in year): ");
		time = sc.nextDouble();
		
		interest = (principalamount * rate *time)/ 100;
		
		System.out.println("Simple Interest is:" +interest);
		System.out.println("Total Amount To Pay: "+(principalamount+interest));
		sc.close();
	}

}
