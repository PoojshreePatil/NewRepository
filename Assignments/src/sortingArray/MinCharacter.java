package sortingArray;

import java.util.Arrays;

public class MinCharacter {

	public static void main(String[] args) {

		char a[] = { 'A', 'D', 'E', 'x', 'z', 'R'};
		for(char i = 0;i < a.length;i++)
		{
		     for(char j =0; j < a.length - 1;j++)
			{
		    	 if(a[j] > a[j+1])
				{
						char temp = a[j];
						a[j] = a[j+1];
						a[j+1] = temp;
				}
        	}
		}
		System.out.println(Arrays.toString(a));
		char min = a[0];
		System.out.println("Minimum Character:" +min);
	}	
}
