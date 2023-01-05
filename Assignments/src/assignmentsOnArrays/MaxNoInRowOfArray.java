package assignmentsOnArrays;

public class MaxNoInRowOfArray {
	//25. WAP to print maximum in rows. Means e.g. arr[][] = {{22, 31, 9}, {12, 25, 16}} 
	//output is: 31 and 25. 
	public static void main(String[] args) {

		int arr[][] = {{22, 31, 9}, {12, 25, 16}} ;
		
		for(int i = 0;i< arr.length;i++)
		{
			for(int j = 0;j< arr[i].length -1;j++)
			{
				if((arr[i][j] > arr[i+1][j+1] )&&(arr[i][j] > arr[i+2][j+2]) )
				{
					int max = arr[i][j];
					System.out.println(max);
				}
			}
		}
	}

}
