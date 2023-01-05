package twoDimensionalArray;

import java.util.Scanner;

public class SparseMatrix {

	public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
		int a[][]=new int[3][3];
		
		 System.out.println("Enter the Array Elements:");
			
			for(int i = 0;i< 3;i++)
			{
				for(int j = 0;j< 3;j++)
				{
					a[i][j]= sc.nextInt();
					//System.out.print(a[i][j]+" ");
				}
				//System.out.println();
			}
			
			 System.out.println("Array Elements are:");
				
				for(int i = 0;i< 3;i++)
				{
					for(int j = 0;j< 3;j++)
					{
						//a[i][j]= sc.nextInt();
						System.out.print(a[i][j]+" ");
					}
					System.out.println();
				}
				int cnt = 1,cnt1 = 1;
				for(int i = 0;i< 3;i++)
				{
					for(int j = 0;j< 3;j++)
					{
						if(a[i][j] == 0)
						{
							cnt++;
						 // System.out.print(a[i][j]+" ");
						}
						else if(a[i][j] > 0)
						{
							cnt1++;
						 // System.out.print(a[i][j]+" ");
						}
					}
					//System.out.println();
				}
				if(cnt > cnt1)
				{
					System.out.println("Sparse");
				}
				else
				{
					System.out.println("Not Sparse");
				}
	
	}

}
