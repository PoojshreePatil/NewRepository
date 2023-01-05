package assignmentsOnArrays;

public class MaximumNumber {

	void maxNumber(int a[])
	{   int max = a[0];
		for(int i = 1;i< a.length;i++)
		{
			if(max < a[i])
			{
				max = a[i];
			}
		
		}
		System.out.println(max);
	}
	public static void main(String[] args) {

		int arr[] = { 20, 0, 31, 45, 100, 1, 105, 90};
		MaximumNumber m = new MaximumNumber();
		m.maxNumber(arr);
	}

}
