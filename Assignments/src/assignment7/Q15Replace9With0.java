package assignment7;

import java.util.Arrays;

public class Q15Replace9With0 {

	public static void main(String[] args) {
		
		int a[] = { 72, 69, 76, 76, 79};
		int rem = 0;
		System.out.println(Arrays.toString(a));
		for(int i = 0; i< a.length;i++)
		{
			if(a[i] % 10 == 9)
			{
				a[i] = 0;
			}
		}
		System.out.println(Arrays.toString(a));
	}
}
