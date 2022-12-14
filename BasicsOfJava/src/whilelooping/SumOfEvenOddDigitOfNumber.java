package whilelooping;

import java.util.Scanner;

public class SumOfEvenOddDigitOfNumber {

	public static void main(String[] args) {

		int num,rem,sum=0,sum1=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		num = sc.nextInt();
		
		while(num !=0)
		{
			rem = num % 10;
			if(rem % 2== 0)
			{
				sum = sum +rem;
			}
			if(rem % 2!= 0)
			{
				sum1 = sum1 +rem;
			}
			num = num / 10;
		}
		System.out.println("Sum Of Even Number: "+sum);
		System.out.println("Sum Of Odd Number: "+sum1);
		sc.close();
	}

}
