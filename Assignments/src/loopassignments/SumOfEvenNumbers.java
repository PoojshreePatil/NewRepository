package loopassignments;

import java.util.Scanner;

public class SumOfEvenNumbers {

	public static void main(String[] args) {
      
		int i=1;
		int n,sum =0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n:");
		n = sc.nextInt();
		
		while(i<=n)
		{
			if(i % 2== 0)
			{
				System.out.print(i+ " ");
				sum = sum +i;
			}
			i++;
		}
		System.out.println("\nSum Of Even Numbers is: "+sum);
		sc.close();
	}

}
