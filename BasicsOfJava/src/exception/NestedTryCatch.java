package exception;

public class NestedTryCatch {

	public static void main(String[] args) {

		int a = 100,b = 0;
		int ar[] = {10,20,30,40,50};
		String s ="abc";
		String s1 = null;
		
		try
		{
			
			try
			{
				try
				{
					try
					{
						System.out.println("Division:"+(a/b));
					}
					catch(ArithmeticException e)
					{
						e.printStackTrace();
						System.out.println(e);
					}
					System.out.println(ar[8]);
				}
				catch(ArrayIndexOutOfBoundsException e)
				{    
					e.printStackTrace();
					System.out.println(e);
				}
				System.out.println(s.charAt(3));
			}
			catch(StringIndexOutOfBoundsException e)
			{
				e.printStackTrace();
				System.out.println(e);
			}
			System.out.println(s1.length());
		}
		catch(NullPointerException e)
		{
			e.printStackTrace();
			System.out.println(e);
		}
	}

}
