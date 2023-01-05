package assignmentsOnArrays;

public class FindIndexOfElement {

	void arrayElements(int a[])
	{
		System.out.println("Elements of Array:");
		for(int i = 0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	void findElementIndex(int a[],int value)
	{
		for(int i = 0;i<a.length;i++)
		{
			if(a[i] == value)
			{
				System.out.println(a[i] +" is at position :"+i);
			}
		}
	}
	public static void main(String[] args) {

		int arr[] = {10,20,30,40,50,60,40,70,80,40,70,90,100};
		
		FindIndexOfElement fi = new FindIndexOfElement();
		fi.arrayElements(arr);
		fi.findElementIndex(arr, 40);
		
	}

}
