package loopassignments;

import java.util.Scanner;

public class SumOfOddNumbers {

	public static void main(String[] args) {

		int i=0,sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n = sc.nextInt();
		
		while(i<= n)
		{
			if( i % 2 != 0)
			{
				System.out.print(i+" ");
				sum = sum+i;
			}
			i++;
		}
		System.out.println("\nSum Of Odd Numbers: "+sum);
		sc.close();
	}

}
