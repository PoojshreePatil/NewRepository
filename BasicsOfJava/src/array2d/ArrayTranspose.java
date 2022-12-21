package array2d;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTranspose {

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
				//System.out.print(a[i][j]+" ");
			}
		//	System.out.println();
		}
      System.out.println("Array Elements are:");
		
		for(int i = 0;i< r;i++)
		{
			for(int j = 0;j< c;j++)
			{
				//a[i][j]= sc.nextInt();
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	
		//int[][] b =new int[][];
		int b[][] = new int [c][r];
		
		System.out.println("Transpose Array  Elements are:");
		for(int i = 0;i<c;i++)
		{
			for(int j = 0;j< r;j++)
			{
				b[i][j] = a[j][i];
			    System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		/*
		 * for(int i = 0;i< c;i++) { for(int j = 0;j< r;j++) { //b[j][i] = a[i][j];
		 * System.out.print(b[i][j]+" "); } System.out.println(); }
		 */
	}

}
