package array;

public class EqualityOfArray {

	public static void main(String[] args) {

		int a[]= {10,20,30,40,50};
		int b[] = {10,200,30,140,50,60};
		int s1 = a.length;
		int s2 = b.length;
	     int cnt = 0;
		
			if(s1 == s2)
			{
				for(int i= 0;i< s1;i++)
				{
			
				   if( a[i] == b[i])
				   {
				     	cnt = 1;
				   }
				   else
				   {
					   cnt = 0;
				   }
				}
			}		
		
		if(cnt == 1)
		{
		   System.out.println("Arrays are Equal");
		}
		else
		{
			System.out.println("Arrays Are Not Equal");
		}
	}
	
}
