package assignment7;

import java.util.Arrays;

public class Q7 {
	//7. Write a program to check if elements of an array are same or not it read 
	//from front or back. E.g.- {2,3,15,15,3,2}.
	public static void main(String[] args) {

		int a[] = {2,3,15,15,3,2};
		System.out.println(Arrays.toString(a));
		int cnt = 0;
		for(int i = 0; i< a.length;i++)
		{
			for(int j = a.length-1; j> 0 ;j--)
			{
			  if( a[i] == a[j])
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
			System.out.println("array are same if it read from front or back.");
		}
		else
		{
			System.out.println("array are Not same if it read from front or back.");
		}
	
	}

	}

