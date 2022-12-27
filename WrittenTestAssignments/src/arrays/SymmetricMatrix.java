package arrays;

import java.util.Scanner;

public class SymmetricMatrix {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row & column of Array");
		int r = sc.nextInt();
		int c = sc.nextInt();
		int a[][] = new int[r][c];
		System.out.println("Enter the Array Elements:");

		for(int i = 0;i< r;i++)
		{
		   for(int j = 0;j< c;j++)
			{
			   a[i][j] = sc.nextInt();
			   System.out.print(a[i][j]+" ");
			   
			}
		   System.out.println();
		}
		int b[][] = new int[r][c];
		System.out.println("Transpose Matrix ");
		int count= 0;
		for(int i = 0;i< c;i++)
		{
		   for(int j = 0;j< r;j++)
			{
			   b[i][j] = a[j][i];
			   System.out.print(b[i][j]+" "); 
				/*
				 * if(a[i][j] == a[j][i]) { count++; }
				 */
			}
		   System.out.println();
		}
		
		
		//int size = r * c;

		//if(count == size)
		if(a == b)
		{
			 System.out.println("Sysmetric Matrix");
		}
		else
		{
			System.out.println("Asysmetric Matrix");
		}
	}

}




/*
 * int count= 0; for(int i = 0;i< c;i++) { for(int j = 0;j< r;j++) { if(a[i][j]
 * == a[j][i]) { count++; } } }
 */
//	System.out.println(count);
