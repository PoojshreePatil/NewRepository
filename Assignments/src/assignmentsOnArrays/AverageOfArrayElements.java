package assignmentsOnArrays;

import java.util.Scanner;

public class AverageOfArrayElements {

	void elementsOfArray(int a[])
	{
		System.out.println("Array Elements are:");
		for(int i = 0;i< a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
	void averageOfArrayElement(int a[])
	{    int sum = 0;
		for(int i = 0;i< a.length;i++)
		{
			sum = sum + a[i];
		}
		int avg = sum / a.length ;
		System.out.println("\nAverage is:"+avg);
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
		AverageOfArrayElements aa = new AverageOfArrayElements();
		aa.elementsOfArray(arr);
		aa.averageOfArrayElement(arr);
	}

}
