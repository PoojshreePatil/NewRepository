package array;

import java.util.Scanner;

public class AdditionOfArray {

	void elementsOfArray(int a[])
	{
		System.out.println("Array Elements are:");
		for(int i = 0;i< a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
	void additionOfArray(int a[])
	{
		  int sum = 0;
			for(int i = 0;i< a.length;i++)
			{
				sum = sum + a[i];
			}
			System.out.println("\nAddition Of Array Elements:"+sum);
	}
	
	public static void main(String[] args) {
		   
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size:");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter Array Elements:");
		for(int i = 0;i< size;i++)
		{
			arr[i] = sc.nextInt();
		}
		AdditionOfArray a = new AdditionOfArray();
		a.elementsOfArray(arr);
		a.additionOfArray(arr);
}
}