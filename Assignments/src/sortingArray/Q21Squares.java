package sortingArray;

public class Q21Squares {
//	21. WAP to display all square number in array. Means e.g. arr[] = [23, 43, 25, 49, 12, 9, 78, 66, 39, 0] so output is 25, 49, 9. 
	public static void main(String[] args) {

		int a[] = {23, 43, 25, 49, 12, 9, 78, 66, 39, 0 };
		for(int i = 0;i< a.length;i++)
		{
			//double sqrt1 = a[i] % 10 == 0;
		   if( Math.sqrt(a[i]) == Math.floor(Math.sqrt(a[i])))
		   
				   {
			          System.out.println(a[i]+" ");
				   }
		}
	}

}
