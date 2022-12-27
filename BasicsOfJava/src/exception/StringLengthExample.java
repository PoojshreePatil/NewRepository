package exception;

public class StringLengthExample {

	int getStringLength(String s) throws NullPointerException
	{
		return s.length();
	}
	
	/*
	 * void stringOperation(String s) { try {
	 * System.out.println(getStringLength(s)); System.out.println(s.toLowerCase());
	 * System.out.println(s.toUpperCase()); } catch(NullPointerException e) {
	 * e.printStackTrace(); } }
	 */
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringLengthExample s1 =new StringLengthExample();
		System.out.println(s1.getStringLength("mumbai"));
		System.out.println(s1.getStringLength("india"));
		
		try
		{
		  System.out.println(s1.getStringLength(null));
		}
		catch(NullPointerException e) 
		{
			e.printStackTrace();
		}

		System.out.println(s1.getStringLength("language"));
		System.out.println(s1.getStringLength("java"));

	}

}
