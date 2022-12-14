package classesandobject;

import java.util.Scanner;

public class SimpleInterest {

	void calculate( int p,int r,int t)
	{
		int simpleinterest = (p * r* t)/100;
		System.out.println(" Simple Interest is: " +simpleinterest);
	}
	
	public static void main(String[] args) {

		int p,r,t;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Principal Amount: ");
		p = sc.nextInt();
		System.out.println("Enter the rate: ");
		r = sc.nextInt();
		System.out.println("Enter the  time(in years): ");
		t = sc.nextInt();
		
		SimpleInterest s = new SimpleInterest();
		s.calculate(p, r, t);
		
	}

}
