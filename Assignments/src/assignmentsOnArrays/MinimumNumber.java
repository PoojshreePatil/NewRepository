package assignmentsOnArrays;

public class MinimumNumber {

	void MinNumber(int a[])
	{
		int min = a[0];
		int max = a[0];
		for(int i =1; i<a.length;i++)
		{
			if( min > a[i])
			{
				min = a[i];
			}
			else
			{
				max = a[i];
			}
		}
		System.out.println(min);
		System.out.println(max);
	}
	public static void main(String[] args) {

		int arr[] = { -20, 0, -25, 15, 19, 37, 23};
		MinimumNumber m = new MinimumNumber();
		m.MinNumber(arr);
	}

}
