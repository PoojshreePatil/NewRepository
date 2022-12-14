package array;

import java.util.Scanner;

public class PrimeElementsOfArray {

	void elementsOfArray(int a[])
	{
		for(int i = 0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
	void primeElements(int a[])
	{ 
		for(int i = 0;i<a.length;i++)
		{
			 int k=2;
			int mid= a[i]/2; 
			while(mid >= k)
			{
				if(a[i] % k== 0)
				{
					break;
				}
				k++;
			}
			if(k>mid)
	        {
	        	System.out.println(a[i]);
	        }
			
		}
	}
	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Size Of Array:");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Elements Of Array");
		for(int i=0;i< size;i++)
		{
			arr[i]= sc.nextInt();
		}
		PrimeElementsOfArray pem = new PrimeElementsOfArray();
	//	pem.elementsOfArray(arr);
		pem.primeElements(arr);
		
	}

}
