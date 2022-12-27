package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfDiagonalElement {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row & column of Array");
		int r = sc.nextInt();
		int c = sc.nextInt();
		int a[][] = new int[r][c];
		System.out.println("Enter the Array Elements:");
		int sum = 0;
		for(int i = 0;i< r;i++)
		{
		   for(int j = 0;j< c;j++)
			{
			   a[i][j] = sc.nextInt();
			   System.out.print(a[i][j]+" ");
			   
			   if( i == j)
			   {
				   sum = sum + a[i][j];
			   } 
			}
		   System.out.println();
		}
		System.out.println("Addition of Main Diagonal Elements : " +sum);
		
		
		/*
		 * int sum = 0; for(int i = 0;i< r;i++) { for(int j = 0;j< c;j++) { if( i == j)
		 * { sum = sum + a[i][j]; } } } System.out.println(sum);
		 */
	}

}
