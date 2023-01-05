package forloop;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {

		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		num = sc.nextInt();
		for(int i = 1; i<=10;i++)
		{
			for(int j =1;j<= num;j++)
			{
			int table = i * j;
			System.out.print(" "+table+"   ");
			
		}
			System.out.println();
		sc.close();
	}
	}
}
