package array;

import java.util.Scanner;

public class ReverseArrray {

	void elementsOfArray(int a[])
	{
		System.out.println("Elements Of Array");
		for(int i = 0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}

	void ReverseElementsOfArray(int a[])
	{
		System.out.println("\nReverse Elements Of Array");
		for(int i = a.length -1;i>= 0;i--)
		{
			System.out.print(a[i]+" ");
		}
	}
		public static void main(String[] args) {
		      Scanner sc = new Scanner(System.in);
		      System.out.println("Enter Size Of Array:");
				int size = sc.nextInt();
				int arr[] = new int[size];
				System.out.println("Enter Elements Of Array");
				for(int i=0;i< size;i++)
				{
					arr[i]= sc.nextInt();
				}
				
				ReverseArrray r = new ReverseArrray();
				r.elementsOfArray(arr);
				r.ReverseElementsOfArray(arr);
	}

}
