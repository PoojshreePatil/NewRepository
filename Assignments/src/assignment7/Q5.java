package assignment7;

import java.util.Arrays;
import java.util.Scanner;

public class Q5 {
	//5. Take 10 integer inputs from user and store them in an array. Now, copy all 
	//the elements in another array but in reverse order
	void copyArrayElement(int a[],int b[])
	{
		for(int i = 0; i< a.length;i++)
		{
			for(int j = 0; j< a.length;i++)
			{
				b[i] = a[i];
			}
	
		}
		System.out.println(Arrays.toString(b));
	}
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size:");
		int size = sc.nextInt();
		//int size = 10;
		int a[] = new int[size];
		System.out.println("Enter 10 Interger Inputs:");
		
		for(int i = 0; i< size;i++)
		{
			a[i] =sc.nextInt();
		}
		System.out.println(Arrays.toString(a));
		int b[]= {};
		Q5 q = new Q5();
		q.copyArrayElement(a, b);
	}
	
}


