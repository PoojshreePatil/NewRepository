package assignmentsOnArrays;

public class MissingNumber {

	public static void main(String[] args) {

		int a[] = {1,2,3,4,6,7,8,9,10};
		int j = 1;
		for(int i = 0;i< a.length;i++)
		{
			if(a[i] != j)
			{
				System.out.println("Missing Number:" +j);
				j++;
			}
			j++;
		}
	}

}
