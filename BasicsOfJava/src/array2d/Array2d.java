package array2d;

public class Array2d {

	public static void main(String[] args) {

		int a[][] = {{1,2,3},{4,5,6},{7,8,9}};
		 
		System.out.println("Length :" +a.length);
		
		for(int i = 0;i< a.length;i++)
		{
			for(int j = 0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("Sum Of all Array elements:");
		int sum = 0;
		for(int i = 0;i< a.length;i++)
		{
			for(int j = 0;j<a[i].length;j++)
			{
				sum = sum +a[i][j];
			}
			//System.out.println();
		}
		System.out.print(sum);
		
		
		System.out.println("\nSum Of Major Diagonal elements:");
		int sum1 = 0;
		for(int i = 0;i< a.length;i++)
		{
			for(int j = 0;j<a[i].length;j++)
			{
				if(i == j)
				{
				  sum1 = sum1 +a[i][j];
				}
			}
			//System.out.println();
		}
		System.out.println(sum1);
		
		
		System.out.println("Sum Of Upper Triagle elements:");
		int sum2 = 0;
		for(int i = 0;i< a.length;i++)
		{
			for(int j = 0;j<a[i].length;j++)
			{
				if(i < j)
				{
				  sum2 = sum2 +a[i][j];
				}
			}
			//System.out.println();
		}
		System.out.println(sum2);
		
		
		System.out.println("Sum Of Lower Triagle elements:");
		int sum3 = 0;
		for(int i = 0;i< a.length;i++)
		{
			for(int j = 0;j<a[i].length;j++)
			{
				if(i > j)
				{
				  sum3 = sum3 +a[i][j];
				}
			}
			//System.out.println();
		}
		System.out.println(sum3);
		
		
		System.out.println("\nSum Of elements of each row:");
	
		for(int i = 0;i< a.length;i++)
		{
			int sum4 = 0;
			for(int j = 0;j<a[i].length;j++)
			{
				  sum4 = sum4 +a[i][j];
			}
			System.out.println(sum4);
			//System.out.println();
		}
		
		System.out.println("Product Of all Array elements:");
		int product = 1;
		for(int i = 0;i< a.length;i++)
		{
			for(int j = 0;j<a[i].length;j++)
			{
				product = product * a[i][j];
			}
			//System.out.println();
		}
		System.out.print(product);
		
		System.out.println("\nProduct Of Major Diagonal elements:");
		int product1 = 1;
		for(int i = 0;i< a.length;i++)
		{
			for(int j = 0;j<a[i].length;j++)
			{
				if(i == j)
				{
				  product1 = product1 * a[i][j];
				}
			}
			//System.out.println();
		}
		System.out.println(product1);
		
		System.out.println("\nProduct Of Upper Triagle elements:");
		int product2 = 1;
		for(int i = 0;i< a.length;i++)
		{
			for(int j = 0;j<a[i].length;j++)
			{
				if(i < j)
				{
				  product2 = product2 * a[i][j];
				}
			}
			//System.out.println();
		}
		System.out.println(product2);
	}

}
