package array2d;

import java.util.Scanner;

public class AdditionOfMatrices {

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
		int a[][] = new int[3][3];
		int b[][] = new int[3][3];
		int c[][] = new int[3][3];
		
		System.out.println("Enter the Array1 Elements:");
		
		for(int i = 0;i< 3;i++)
		{
			for(int j = 0;j< 3;j++)
			{
				a[i][j]= sc.nextInt();
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		/*
		 * System.out.println("Array1 Elements are:");
		 * 
		 * for(int i = 0;i< 3;i++) { for(int j = 0;j< 3;j++) {
		 * System.out.print(a[i][j]+" "); } System.out.println(); }
		 */
			
		
			System.out.println("Enter the Array2 Elements:");
			
			for(int i = 0;i< 3;i++)
			{
				for(int j = 0;j< 3;j++)
				{
					b[i][j]= sc.nextInt();
					System.out.print(b[i][j]+" ");
				}
				System.out.println();
			}
			
			/*
			 * System.out.println("Array2 Elements are:");
			 * 
			 * for(int i = 0;i< 3;i++) { for(int j = 0;j< 3;j++) {
			 * System.out.print(b[i][j]+" "); } System.out.println(); }
			 */
				System.out.println("Addition Of 2 Matrices");
				for(int i = 0;i< 3;i++)
				{
					for(int j = 0;j< 3;j++)
					{
						c[i][j] = a[i][j]  + b[i][j];
						System.out.print(c[i][j]+" ");
					}
					System.out.println();
				}

				int d[][]=new int[3][3];
				System.out.println("Transpose Matrix of Addition");
				for(int i = 0;i< 3;i++)
				{
					for(int j = 0;j< 3;j++)
					{
						d[j][i]= c[i][j];
					}
				}
				for(int i = 0;i< 3;i++)
				{
					for(int j = 0;j< 3;j++)
					{
				    	System.out.print(d[i][j]+" ");
					}
					System.out.println();
				}
				System.out.println("Multiplication  Of 2 Matrices");
				for(int i = 0;i< 3;i++)
				{
					for(int j = 0;j< 3;j++)
					{ c[i][j] = 0;
						for(int k = 0;k< 3;k++)
						{
						   c[i][j]+= a[i][k]*b[k][j];
						
						}
						   System.out.print(c[i][j]+" ");
					}
					System.out.println();
				}
				
			
				int e[][]=new int[3][3];
				System.out.println("Transpose Matrix of Multiplication matrix");
				for(int i = 0;i< 3;i++)
				{
					for(int j = 0;j< 3;j++)
					{
						e[j][i]= c[i][j];
					}
				}
				for(int i = 0;i< 3;i++)
				{
					for(int j = 0;j< 3;j++)
					{
				    	System.out.print(e[i][j]+" ");
					}
					System.out.println();
				}
				
	}

}
