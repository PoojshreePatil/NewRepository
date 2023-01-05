package assignment7;

import java.util.Arrays;
import java.util.Scanner;

public class Q4 {
	/*
	 * 4. Take 20 integer inputs from user and print the following: number of
	 * positive numbers number of negative numbers number of odd numbers number of
	 * even numbers number of 0s.
	 */
	void positiveNumber(int a[])
	{
    	//System.out.println(Arrays.toString(a));
    	int cnt=0;
    	for(int i = 0; i< a.length;i++)
		{
		      if(a[i] > 0)
		      { 
		    	  cnt++;
		    	 // System.out.println(a[i]);
		      }
		}
    	System.out.println("Number of Positive Number:"+cnt);
    	
	}
	void negativeNumber(int a[])
	{
    	//System.out.println(Arrays.toString(a));
    	int cnt=0;
    	for(int i = 0; i< a.length;i++)
		{
		      if(a[i] < 0)
		      { 
		    	  cnt++;
		    	 // System.out.println(a[i]);
		      }
		}
    	System.out.println("Number of Negative Number:"+cnt);
    	
	}
	void evenNumber(int a[])
	{
		int cnt = 0;
    //	System.out.println(Arrays.toString(a));
    	for(int i = 0; i< a.length;i++)
		{
		      if(a[i] % 2 == 0)
		      {
		    	  cnt++;
		      }
		}
    	System.out.println("Number of Even Number:"+cnt);
    	
	}
	void oddNumber(int a[])
	{
		int cnt = 0;
    //	System.out.println(Arrays.toString(a));
    	for(int i = 0; i< a.length;i++)
		{
		      if(a[i] % 2 == 0)
		      {
		    	  cnt++;
		      }
		}
    	System.out.println("Number of Even Number:"+cnt);
    	
	}
	void numberOfZeros(int a[])
	{
		int cnt = 0;
    //	System.out.println(Arrays.toString(a));
    	for(int i = 0; i< a.length;i++)
		{
		      if(a[i] == 0)
		      {
		    	  cnt++;
		      }
		}
    	System.out.println("Number of Zeros :"+cnt);
    	
	}
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		//System.out.println("Enter Size:");
		//int size = sc.nextInt();
		int size = 20;
		int a[] = new int[size];
		System.out.println("Enter 20 Interger Inputs:");
		
		for(int i = 0; i< size;i++)
		{
			a[i] =sc.nextInt();
		}
		System.out.println(Arrays.toString(a));
		Q4 q = new Q4();
		q.positiveNumber(a);
		q.negativeNumber(a);
		q.evenNumber(a);
		q.oddNumber(a);
		
	}

}
