package sortingArray;

import java.util.Arrays;
public class AverageOfArrayExceptminmax {
     void averageOfElement(int a1[])
    {
    	 int sum = 0;
     	for(int i = 1;i< a1.length-1;i++)
     	{
	    	sum = sum + a1[i];
	    }
     	int n = a1.length-2;
	    int Avg = sum / n; 
	    System.out.println("Average: "+Avg);
   }


	public static void main(String[] args) {

		int a[] = { 20,31,69,12,57,89,32,45};
		
		System.out.println(Arrays.toString(a));
		
		for(int i = 0;i< a.length;i++)
		{
		  for(int j = 0;j< a.length - 1;j++)
		  {
			if(a[j] > a[j+1])
			{
				int temp = a[j];
				a[j] = a[j+1];
				a[j+1] = temp;
			}
		}
	}
		System.out.println(Arrays.toString(a));
		
		

		AverageOfArrayExceptminmax m = new AverageOfArrayExceptminmax();
		m.averageOfElement(a);
}
}
