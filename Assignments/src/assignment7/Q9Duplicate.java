package assignment7;

import java.util.Arrays;

public class Q9Duplicate {
	//9. WAP to find and count total number of duplicate elements in an array.
	public static void main(String[] args) {
 
		int a[] = {2,3,15,15,3,2};
		System.out.println(Arrays.toString(a));
		//int cnt = 0,i;
		for(int i = 0; i< a.length;i++)
		{
			for(int j = i+ 1; j<a.length ;j++)
			{
			  if( a[i] == a[j])
			  {
				  System.out.println(a[i]);
			  }
			}
			
	}
		

}
}