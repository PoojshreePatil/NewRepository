package assignmentsOnArrays;

public class ReturnValueOfMethod {

	public static int average() 
	{
		int avg,sum = 0;
		int arr[] = {1,2,3,4,5,6};
		for(int i = 0 ;i< arr.length;i++)
		{
			sum = sum + arr[i];
		}
		avg = sum / arr.length;
		System.out.println("Average:"+avg);
		
		return avg;
	}
	
	public static double average1() 
	{
		double avg,sum = 0;
		double arr[] =  {6.0,3.4,6.4,1.2,4.0};
		for(int i = 0 ;i< arr.length;i++)
		{
			sum = sum + arr[i];
		}
		avg = sum / arr.length;
		System.out.println("Average:"+avg);
		
		return avg;
	}
	
	public static void main(String[] args) {

		ReturnValueOfMethod r =new ReturnValueOfMethod();
		r.average();
		r.average1();
		
	}

}
