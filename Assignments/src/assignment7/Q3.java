package assignment7;

import java.util.Arrays;
import java.util.Scanner;

public class Q3 {
	/*
	 * 3. Take 10 integer inputs from user and store them in an array. Again ask
	 * user to give a number. Now, tell user whether that number is present in array
	 * or not.
	 */
	
	void findArrayElement(int a[],int num)
	{
		for(int i = 0; i< a.length;i++)
		{
			if(a[i] == num)
			{
				System.out.println(num+" At Position"+i);
			}
		}
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
		System.out.println("Enter a Number:");
		int num = sc.nextInt();
		
		Q3 q = new Q3();
		q.findArrayElement(a, num);
	}
}
