package array;

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
		System.out.println("Elements of Array after Conversion of Negatine Element into 0:");
		for(int i = 0;i< a.length;i++)
		{
			if(a[i] < 0)
			{
				a[i] = 0;
			}
		
		System.out.print(a[i]+" ");}
	}
	public static void main(String[] args) {
   
		int arr[]= { 2,-1,56,-2,67,-9,90,-5};
		NegativeElementConversion na = new NegativeElementConversion();
		na.arrayElements(arr);
		na.negativeElement(arr);
		
	}

}
