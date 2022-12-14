package array;

import java.util.Arrays;

public class CharacterBubbleSorting {

	public static void main(String[] args) {

		char a[]= {'z','b','p','o','j','s','r','e'};
		
        System.out.println(Arrays.toString(a));
		
		for(int i = 0;i < a.length;i++)
		{
			for(int j =0; j < a.length - 1;j++)
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
	}
		
	}


