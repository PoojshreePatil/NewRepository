package exception;

public class FinallyBlock {

	public static void main(String[] args) {

		int a  = 29,b = 0;
		
		try
		{
			System.out.println(a/b);
		}
		/*
		 * catch(ArithmeticException e) { e.printStackTrace(); }
		 */
		finally
		{
			System.out.println("Finally block executed...");
		}
	}

}
