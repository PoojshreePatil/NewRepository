package sortingArray;

import java.util.Arrays;

public class SwappingArray {

	public static void main(String[] args) {

		int a[] = {2, 4, 9, 0};
		
		System.out.println(Arrays.toString(a));
		
		for(int i = 0;i<  2;i++)
		{
			int temp = a[i];
			a[i] = a[4-2+i];
		    a[4-2+i] = temp;
		}
		System.out.println(Arrays.toString(a));
	}

}
