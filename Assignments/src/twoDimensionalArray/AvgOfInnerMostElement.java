package twoDimensionalArray;

import java.util.Scanner;

public class AvgOfInnerMostElement {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		/*System.out.println("Enter the Row Numbers:");
		int r = sc.nextInt();
		System.out.println("Enter the Coloumns Numbers:");
		int c = sc.nextInt();*/
		int a[][] = new int[4][4];
		
		
        System.out.println("Enter the Array Elements:");
		
		for(int i = 0;i< 4;i++)
		{
			for(int j = 0;j< 4;j++)
			{
				a[i][j]= sc.nextInt();
				System.out.print(a[i][j]+"  ");
			}
			System.out.println();
	    }
		
     System.out.println("Average Of inner Most Elements");
        
		int sum = 0,cnt = 1;
		for(int i = 0;i< 4;i++)
		{
			for(int j = 0;j< 4;j++)
			{
				if((i == 1 || i== 4 )&&(j == 1 || j== 4))
				{
					break;
				}
				else
				{   
					cnt++;
			    	sum = sum + a[i][j];
			     }
			System.out.println();
	      }
			int avg = sum /cnt;
	     System.out.println("Average:"+avg);
		
		}
}
}