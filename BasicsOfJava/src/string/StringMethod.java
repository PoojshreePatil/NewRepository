package string;

public class StringMethod {

	public static void main(String[] args) {

		String s1 =  "Java";
		String s2 = "Java is Language";
		String s3 = "java";
		String s4 = "Java";
			
	  System.out.println( s1 == s4);
	  System.out.println(s1.equals(s4));
	  System.out.println(s1.equalsIgnoreCase(s3));
	  System.out.println(s1.concat("Programming Language"));
	  System.out.println(s1.compareTo(s4) == 0);
	  System.out.println(s1.compareTo(s3) < 0);
	  System.out.println(s1.compareTo(s2) > 0);
	  System.out.println(s2.contains(s4));
	  System.out.println(s1.startsWith("P", 0));
	  System.out.println(s1.endsWith("a"));
	  System.out.println(s2.charAt(5));
	  System.out.println(s2.indexOf("is"));
	  System.out.println(s3.lastIndexOf("a"));
	  System.out.println(s3.replace('j', 'J'));
	  System.out.println(s2.substring(8));
	  System.out.println(s2.substring(8, 16));
	  System.out.println(s3.toUpperCase());
	  System.out.println(s2.toLowerCase());
	//  char a[];
	 // System.out.println(s1.copyValueOf('a', 1, 0));
	 
	}

}
