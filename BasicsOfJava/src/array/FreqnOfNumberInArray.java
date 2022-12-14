package array;

public class FreqnOfNumberInArray {

	public static void main(String[] args) {

		int a[] = { 10,20,10,40,10,20,30,10};
		int cnt = 0;
		
		for(int i= 0;i< a.length;i++)
		{
	
		   if( a[i] == 10)
		   {
			   cnt++;
		   }
	   }

		System.out.println("10 is "+cnt+" times print in Array");
}
}