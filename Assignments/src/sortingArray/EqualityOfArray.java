package sortingArray;

import java.util.Arrays;

public class EqualityOfArray {

	public static void main(String[] args) {

		int a[] = {12, 22, 32, 42, 52, 62};
		int b[] = {42, 22, 32, 12, 52, 62};
		//int b[] = {14, 15, 18, 32, 82, 62,56};
		
		int cnt = 0;
		
		if(a.length == b.length)
		{
			for(int i = 0;i< a.length;i++)
			{
				for(int j = 0;j< a.length -1 ;j++)
				{
				    if(a[j] > a[j+1])
				    {
				      int temp = a[j];
				      a[j]= a[j+1];
				      a[j+1]=temp;
				   
				    }
				}
			}
			System.out.println(Arrays.toString(a));
			
			  for(int i = 0;i< a.length;i++)
			   {
				  for(int j = 0;j< a.length -1 ;j++)
				  {	  
				    if(b[j] > b[j+1])
					   {
					     int temp1 = b[j];
					     b[j]= b[j+1];
					     b[j+1]=temp1;
					   }
				   }  
			    }
			  System.out.println(Arrays.toString(b));
		
		
		for(int i = 0;i< a.length;i++) 
		{
			if(a[i] == b[i])   
		    {
		         cnt ++;   
		    }
			else
			{
				cnt = 0;
			}
		}
		if(cnt == a.length)  
		{
			System.out.println("Equal");
		}
		else
		{
			System.out.println("Not Equal");
		}
		}
		else
		{
			System.out.println("Array Length is Not Equal");
		}
	}
}
		/*//int a2[] = {12, 22, 32, 42, 52, 62};
		//int a2[] = {52, 22, 62, 12, 42, 22};
		
		int s1 = a.length;
		int s2 = b.length;
		int cnt = 0;
		
		if(s1 == s2)
		{
			for(int i = 0;i< s1;i++)
			{
					if(a[i] == b[i])
					{
						cnt = 1;
					}
					else
					{
						cnt = 0;
					}
			    }
		    
		}
		if(cnt == 1)
		{
			System.out.println("Arrays are Equal");
		}
		else
		{
			System.out.println("Arrays are Not Equal");
}		}
	}*/

