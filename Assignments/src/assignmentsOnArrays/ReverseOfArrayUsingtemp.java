package assignmentsOnArrays;

import java.util.Arrays;

public class ReverseOfArrayUsingtemp {

	public static void main(String[] args) {
		
	int a[] = {10,20,30,40,50,60};
	int n = a.length;
	int mid = n / 2 ;
    System.out.println(Arrays.toString(a));
	
	  for(int i = 0;i< mid;i++)
	  {
		  int temp = a[i];
		  a[i] = a[n-i-1];
		  a[n-i-1] = temp; 
	  }
	 
	/*
	 * for(int i = 0;i< mid;i++) { a[i] = a[i] + a[n-i-1] ; a[n-i-1] = a[i] -
	 * a[n-i-1] ; a[i] = a[i] - a[n-i-1] ; }
	 */
    System.out.println(Arrays.toString(a));


	
	}

}
