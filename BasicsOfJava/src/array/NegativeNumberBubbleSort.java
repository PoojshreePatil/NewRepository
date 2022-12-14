package array;

import java.util.Arrays;

public class NegativeNumberBubbleSort {

	public static void main(String[] args) {

		int a[] = {10,-50,30,-2,40,60,-9,8};
		System.out.println(Arrays.toString(a));
		
		for(int i = 0;i < a.length;i++)
		{
			for(int j =0; j < a.length - 1;j++)
			{
				if(a[j] > a[j+1])
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
