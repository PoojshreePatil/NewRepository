package assignmentsOnArrays;

public class NegativeElementConversion {

	void arrayElements(int a[])
	{
		System.out.println("Elements of Array:");
		for(int i = 0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	void negativeElement(int a[])
	{
		System.out.println("Elements of Array after Conversion of Negitive Element :");
		for(int i = 0;i< a.length;i++)
		{
			if(a[i] < 0)
			{
				a[i] = a[i-1]*a[i-1];
			}
		
		System.out.print(a[i]+" ");
		}
	}
	void negativeElement1(int a[])
	{
		System.out.println("Elements of Array after Conversion of Negitive Element :");
		for(int i = 0;i< a.length;i++)
		{  int j = 0;
			if(a[i] < 0)
			{ 
				for(j = 0; j< a.length;j++ )
				{
					a[j]= a[i];
				}
				
			}
			/*
			 * else { for(j = a.length-1; j> 0;j--) { a[j]= a[i]; } }
			 */
		System.out.print(a[j]+" ");
		
		
		}
	}
	public static void main(String[] args) {
   
		int arr[]= {12, 3, -19, 29, 5, -61, 44, 7, -9};
		NegativeElementConversion na = new NegativeElementConversion();
		na.arrayElements(arr);
		na.negativeElement(arr);
		na.negativeElement1(arr);
		
	}

}
