package sortingArray;

import java.util.Arrays;

public class EvenOddElements {

	public static void main(String[] args) {

		int a[] = {10,53,30,13,47,60,11,8};
		System.out.println(Arrays.toString(a));
		
		for(int i = 0;i < a.length;i++)
		{
		     for(int j = 0; j < a.length-1 ;j++)
			{
		    	 if(a[j] % 2 != 0 )
				{
						int temp = a[j];
						a[j] = a[j+1];
						a[j+1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}

	}


