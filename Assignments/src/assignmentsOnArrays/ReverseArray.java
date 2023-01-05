package assignmentsOnArrays;

public class ReverseArray {

	void arrayElements(int a[])
	{ 
		  System.out.println("Elements are:"); 
		  for(int i = 0;i< a.length;i++)
		  {
		  System.out.print(a[i]+" "); 
		  }
		 
		System.out.println("\nReverse Array Elements are:");
		for(int j = a.length-1 ; j >= 0 ;j--)
		{
			System.out.print(a[j]+" ");
		}
		
	}
	
	public static void main(String[] args) {
	
		int arr[] = {3, 90, 45, 29, 37, 78};
		ReverseArray ra = new ReverseArray();
		ra.arrayElements(arr);
	}

}
