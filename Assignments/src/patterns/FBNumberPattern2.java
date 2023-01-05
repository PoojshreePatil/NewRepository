package patterns;

public class FBNumberPattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a =0,b=1,c;
		for(int i = 1;i<=8;i++)
		{
			for(int j=1;j<=i;j++)                   
			{
				c=a+b;
				System.out.print(a+" ");
				a=b;
				b=c;
				
			}
			 a=0;
			 b=1;
			System.out.println();
		}

		
		
}
}