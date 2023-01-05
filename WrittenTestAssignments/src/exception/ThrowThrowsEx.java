package exception;

public class ThrowThrowsEx {

	String s;
	int stringCheck(String s)throws NullPointerException
	{
		if(s == null)
		{
		   throw new NullPointerException("String is Null... Null String is not allowed");
	    }
    	return s.length();
	}
	
	
	public static void main(String[] args) {

		ThrowThrowsEx e2 = new ThrowThrowsEx();
		 System.out.println(e2.stringCheck("hkjjh"));
		 try
		 {
		   System.out.println(e2.stringCheck(null));
		 }
		 catch(NullPointerException e)
		 {
			 e.printStackTrace();
		 }
	}

}
