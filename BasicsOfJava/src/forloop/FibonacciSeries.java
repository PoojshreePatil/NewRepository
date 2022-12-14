package forloop;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {

		int f0=0,f1=1,n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		n = sc.nextInt();
		for(int i =1;i<=n ;i++)
		{
			int f2 =f0+f1;
			System.out.println(f0);
			f0 =f1;
			f1=f2;
		}
	 sc.close();
	}

}
