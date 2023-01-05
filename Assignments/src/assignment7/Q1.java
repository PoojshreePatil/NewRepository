package assignment7;

import java.util.Arrays;
import java.util.Scanner;

public class Q1 {
	//1. Take 10 integer inputs from user and store them in an array and print them on screen.

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
	}

}
