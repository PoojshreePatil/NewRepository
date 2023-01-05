package patterns;

public class FibonacciSeriesPattern1 {

	public static void main(String[] args) {

		int f0=0,f1=1;
		for(int i = 1;i<=4;i++)
		{
			for(int j = 1;j<=i;j++)
			{
				int f2= f0 + f1;
				System.out.print(f0 +" ");
				f0=f1;
				f1=f2;
				
			}
			System.out.println();
		}
	}

}
