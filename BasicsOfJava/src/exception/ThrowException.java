package exception;

public class ThrowException {

	int getStringLength(String s) throws NullPointerException
	{
		if(s== null)
		{
			throw new NullPointerException("String is null .....Null String is not allowed");
		}
		return  s.length();
	}
	
	public static void main(String[] args) {

		ThrowException t = new ThrowException();
		System.out.println(t.getStringLength("mumbai"));
	
		
		try
		{
		  System.out.println(t.getStringLength(null));
		}
		catch(NullPointerException e) 
		{
			e.printStackTrace();
		}
		System.out.println(t.getStringLength("india"));
	}

}
