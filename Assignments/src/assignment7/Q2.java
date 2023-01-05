package assignment7;

import java.util.Arrays;
import java.util.Scanner;

public class Q2 {
	//2. WAP to print the alternate values from an array.
	void alternateArray(int a[])
	{
        System.out.println("Alternate Array Elements:");
		
		for(int i = 0; i< a.length;i+=2)
		{
			System.out.println(a[i]);
		}
	
	}
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size:");
		int size = sc.nextInt();
		int a[] = new int[size];
		System.out.println("Enter Array Elements:");
		
		for(int i = 0; i< size;i++)
		{
			a[i] =sc.nextInt();
		}
		System.out.println(Arrays.toString(a));
		
		Q2 q = new Q2();
		q.alternateArray(a);
	}

}
