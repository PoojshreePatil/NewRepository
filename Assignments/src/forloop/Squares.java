package forloop;

import java.util.Scanner;

public class Squares {

	public static void main(String[] args) {

		
		int num, sqr = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		num = sc.nextInt();
		for(int i =1;i<=num;i++)
		{
			sqr = i*i;
			System.out.println(sqr);
		}
		sc.close();
	}

}
