package array;

import java.util.Arrays;

public class ReverseOfArray1 {

	public static void main(String[] args) {

		int a[] = {1,2,3,4,5,6,7,8};
		int n = a.length;
		int mid = n / 2;
		 System.out.println(Arrays.toString(a));
			
		  for(int i = 0;i< mid;i++)
		  {
			  int temp = a[i];
			  a[i] = a[mid + i];
			  a[mid + i] = temp; 
		  }
			 System.out.println(Arrays.toString(a));
	}

}
