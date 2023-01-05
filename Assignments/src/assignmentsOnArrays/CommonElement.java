package assignmentsOnArrays;

import java.util.Arrays;

public class CommonElement {

	
	void commonElementinArrays(int a1[],int a2[])
	{
		for(int i = 0; i< a1.length;i++)
		{
			for(int j = 0 ;j< a2.length;j++)
			{
				if(a1[i] == a2[j])
				{
					System.out.println(a1[i]);
				}
			}
		}
	}
	public static void main(String[] args) {

		int arr1[] = { 12, 22, 34, 67 ,78, 91, 56};
		int arr2[] = { 39, 25, 15, 23, 55, 99,66, 22};
		
	    System.out.println("First Array Elements:"+Arrays.toString(arr1));
		System.out.println("Second Array Elements:"+Arrays.toString(arr2));
		CommonElement c = new CommonElement();
		c.commonElementinArrays(arr1, arr2);
		
	}

}
