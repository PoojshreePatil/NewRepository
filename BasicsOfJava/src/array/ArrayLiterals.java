package array;

public class ArrayLiterals {

	void arrayLength(int a[])
	{
		System.out.println("Length of Array:"+ a.length);
	}
	void arrayElements(int a[])
	{
		for(int i = 0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	void arrayAlternativeElements(int a[])
	{
		System.out.println("Alternate Elements are:");
		for(int i = 0;i<a.length;i+=2)
		{
			System.out.print(a[i]+" ");
		}
	}
	void searchArray(int a[], int element)
	{
		int cnt = 0;
		for(int i = 0;i<a.length;i++)
		{
			if(a[i] == element)
			{
				System.out.println("\nElemant at the position :"+i);
				cnt = 1;
			}
			else
			{
				cnt++;
			}
		}
		if(cnt == a.length)
		{
			System.out.println("Element is Not Present");
		}
	}
	public static void main(String[] args) {

		int arr[] = {10,20,30,40,50,60,70,80,90,100};
		ArrayLiterals ar = new ArrayLiterals();
		ar.arrayLength(arr);
		ar.arrayElements(arr);
		ar.arrayAlternativeElements(arr);
		ar.searchArray(arr, 60);
	}

}
