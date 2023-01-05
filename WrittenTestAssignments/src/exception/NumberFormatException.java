package exception;

public class NumberFormatException {

	
	  static String s="1213";
	  
	  public static void main(String[] args) 
	  {
		  try
		  {
	       int j=Integer.parseInt(s);
	       }
		  catch(Exception n)
		  {
	          System.out.println("number mismatch"); 
	          n.printStackTrace();
	       }
 }
	 
}
/*
 * private static final String inputString = "123.33";
 * 
 * public static void main(String[] args) { try { int a =
 * Integer.parseInt(inputString); } catch(Exception ex) { ex.printStackTrace();
 * // System.err.println("Invalid string in argumment"); //request for
 * well-formatted string }
 */
