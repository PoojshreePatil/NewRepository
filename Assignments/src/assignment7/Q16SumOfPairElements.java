package assignment7;

import java.util.Arrays;

public class Q16SumOfPairElements {

	public static void main(String[] args) {

		int a[] = { 4, 6, 5, -10, 8, 5, 20};
		//int rem = 0;
		System.out.println(Arrays.toString(a));
		for(int i = 0; i< a.length;i++)
		{
		  for(int j = i+1; j< a.length;j++)
			{
			if(a[i] + a[j] == 10)
			{
				System.out.println(a[i]+","+a[j]);
			}
			}
		}
		System.out.println(Arrays.toString(a));
	}
	}

