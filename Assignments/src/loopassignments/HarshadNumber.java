package loopassignments;

import java.util.Scanner;

public class HarshadNumber {

	public static void main(String[] args) {

		int num,sum = 0,rem;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		num = sc.nextInt();
		int temp =num;
		
		while(num != 0)
		{
			rem = num % 10;
			sum = sum + rem;
			num = num / 10;
		}
		if(temp % sum == 0)
		{
			System.out.println(temp+ " is Harshad Number");
		}
		else
		{
			System.out.println(temp+ " is not Harshad Number");
		}
		sc.close();
	}

}
