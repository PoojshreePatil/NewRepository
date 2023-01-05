package assignment7;

import java.util.Arrays;

public class Q14 {
	/*
	 * 14.Write a java program to separate zeros from non-zeros in an integer array?
	 * Input Array - [12, 0, 7, 0, 8, 0, 3] Input Array After moving zeros to end -
	 * [12, 7, 8, 3, 0, 0, 0]
	 */
	public static void main(String[] args) {

		int a[] = {12, 0, 7, 0, 8, 0, 3};
		System.out.println(Arrays.toString(a));
		
		for(int i = 0;i< a.length;i++)
		{
			for(int j = 0;j< a.length -1;j++)
			{
				if(a[j] == 0)
				{
					int temp = a[j];
					a[j] = a[j + 1];
					a[j+1] = temp;
				}
			}
			
		}
		System.out.println(Arrays.toString(a));
	}
	}


