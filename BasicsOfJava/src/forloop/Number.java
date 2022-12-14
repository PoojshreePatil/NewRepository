package forloop;

import java.util.Scanner;

public class Number {

	public static void main(String[] args) {

		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		n = sc.nextInt();
		int sum = 0;
		for(int i =1;i<=n;i++)
		{
			System.out.print(i+ " ");
		
		sum = sum + i;
		}
		System.out.println("sum:"+sum);
		sc.close();
	}

}
