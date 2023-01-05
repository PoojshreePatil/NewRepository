package exception;

public class Exception1 {

	int add()
	{
    	try
	  {
		    return 10;
	   }
	  catch(ArithmeticException e)
	   {
		   e.printStackTrace();
	   }
    	finally
	  {
		   return 15;
	  }
	}
	public static void main(String[] args) {

		Exception1 e1 = new Exception1();
		System.out.println(e1.add());
        
		
	}

}
