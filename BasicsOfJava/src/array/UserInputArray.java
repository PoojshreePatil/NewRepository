package array;

import java.util.Arrays;
import java.util.Scanner;

public class UserInputArray {
	int size;
	void arrayEvenElements(int a[],int size)
	{
		System.out.println("Even Elements are:");
		for(int i = 0;i< size;i++)
		{
			if(a[i] % 2 == 0)
			{
				System.out.println(a[i]+" ");
			}
			
		}
	}
	
	public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the size of array:");
       int size = sc.nextInt();
       int arr[] = new int[size];  
       System.out.println("Enter the array elements:");
       
    	   for(int i = 0;i < size;i++)
    	   {
    		   arr[i] = sc.nextInt();
    	   }
       
    	   System.out.println("Array elements are:");
           
    	   for(int i = 0;i < size;i++)
    	   {
    	       System.out.println(arr[i]+" ");
    	   }
       
    	   UserInputArray ar = new UserInputArray();
           ar.arrayEvenElements(arr,size);
    	   
      //  System.out.println(Arrays.toString(arr));
	


	}

}
