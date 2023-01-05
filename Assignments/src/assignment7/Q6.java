package assignment7;

import java.util.Arrays;
import java.util.Scanner;

public class Q6 {
	//6. Write a program to find the sum and product of all elements of an array.

	void sumAndprodect(int a[])
	{int sum = 0,product = 1;
		for(int i = 0; i< a.length;i++)
		{
			sum = sum +a[i];
			product = product * a[i];			
		}
		System.out.println("Sum Of Array Element: "+sum);
		System.out.println("Product Of Array Element: "+product);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = 10;
		int a[] = new int[size];
		System.out.println("Enter 10 Interger Inputs:");
		
		for(int i = 0; i< size;i++)
		{
			a[i] =sc.nextInt();
		}
		System.out.println(Arrays.toString(a));
		Q6 q = new Q6();
		q.sumAndprodect(a);
	}

}
