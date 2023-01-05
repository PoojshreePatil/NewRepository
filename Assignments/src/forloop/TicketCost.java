package forloop;

import java.util.Scanner;

public class TicketCost {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n,tc,age =0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of passengers :");
		n = sc.nextInt();
		System.out.println("Enter the ticket Cost:");
		tc = sc.nextInt();
		System.out.println("Enter the Age Of Passengers:");
		age = sc.nextInt();
	    
		//total = tc * n;
		if(age < 12)
		{
			float dis =1.0f;
			System.out.println("30 % Discount");
			dis= tc * 0.3f;
			double amt =tc - dis;
			double total = amt *n;
			System.out.println(total);
		}
		else if( age > 59)
		{
			float dis = 0.0f;
			System.out.println("50 % Discount");
			dis= tc * 0.5f;
			double amt =tc - dis;
			double total = amt *n;
			System.out.println(total);
		}
		else
		{
			System.out.println("need to pay full cost");
			int total = tc * n;
			System.out.println(total);
		}
		sc.close();
	}

}
