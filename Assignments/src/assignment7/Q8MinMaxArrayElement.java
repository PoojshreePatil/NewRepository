package assignment7;

import java.util.Arrays;
import java.util.Scanner;

public class Q8MinMaxArrayElement {

	    void sortArrayElements(int a[])
	    {
	    	for(int i = 0; i< a.length;i++)
			{
	    		for(int j = 0; j< a.length-1;j++)
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
	    	 System.out.println("Minimum Number:"+a[0]);
	    	 System.out.println("Maximum Number:"+a[a.length -1]);
	    }
	   
	   
	    
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size:");
		int size = sc.nextInt();
		//int size = 10;
		int a[] = new int[size];
		System.out.println("Enter Interger Inputs:");
		
		for(int i = 0; i< size;i++)
		{
			a[i] =sc.nextInt();
		}
		System.out.println(Arrays.toString(a));
		
		Q8MinMaxArrayElement q = new Q8MinMaxArrayElement();
		q.sortArrayElements(a);
	}

}
