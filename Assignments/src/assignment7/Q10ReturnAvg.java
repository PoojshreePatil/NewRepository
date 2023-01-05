package assignment7;

import java.util.Arrays;
import java.util.Scanner;

public class Q10ReturnAvg {

	/*
	 * 10.Write methods that return the average of an array with following headers
	 * and invoke the method from main
	i. public static int average(int[] array)
	*/
	
	public static int average(int[] array) 
	{
	 int sum = 0;
		for(int i = 0; i< array.length;i++)
		{
			sum = sum + array[i];
		}
		int avg = sum / array.length;
		System.out.println("Average:"+avg);
		 return avg;
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
		
		Q10ReturnAvg q = new Q10ReturnAvg();
		q.average(a);
		
	}

}
