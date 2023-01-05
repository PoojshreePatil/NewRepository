package twoDimensionalArray;

import java.util.Scanner;

public class SumOfRowandColumn {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Row Numbers:");
		int r = sc.nextInt();
		System.out.println("Enter the Coloumns Numbers:");
		int c = sc.nextInt();
		int a[][] = new int[r][c];
		
		
        System.out.println("Enter the Array Elements:");
		
		for(int i = 0;i< r;i++)
		{
			for(int j = 0;j< c;j++)
			{
				a[i][j]= sc.nextInt();
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
      System.out.println("Sum Of Array Elements Of Each row:");
	
		for(int i = 0;i< r;i++)
		{	int sum =0;
			for(int j = 0;j< c;j++)
			{
			     sum = sum + a[i][j];	
			}
			System.out.println(sum);
		//	System.out.println();
		}
		
	
	}

}
