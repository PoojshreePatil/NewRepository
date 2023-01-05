package string;

import java.util.Arrays;

public class Q1 {

	public static void main(String[] args) {
     
		String s= "String";
		String s2 = "String";
		String s1 = new String("Java");
		String s3 = new String("Java");
		//String s4;
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s == s2);
		System.out.println(s.equals(s2));
		System.out.println(s1 == s3);
		System.out.println(s1.equals(s3));
		
		System.out.println(s.length());
		System.out.println(s1.length());
		System.out.println(s1+s2);
		System.out.println(s1.concat(s3));
		System.out.println(s.compareTo(s2) == 0);
		System.out.println(s.compareTo(s1) > 0);
		System.out.println(s1.compareTo(s) < 0);
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
	
	//	System.out.println(s3.copyValueOf(s));
		
		String s4 = "HELLO@WORLD";
		
		String s5[]= s4.split("@");
		
		//char ch = s4.toCharArray();
		System.out.println(Arrays.toString(s5));
		 System.out.println(s4.indexOf('L'));
		 
		// 11.	Write a Java program to count occurrences of a character in given string.
		
		 String s6 = " Java is Programming is language ";
		 System.out.println(s6.trim());
		 
		 String s7[] = s6.split(" ");
		 System.out.println(Arrays.toString(s7));
		 System.out.println(s7.length);
		 
		 System.out.println(s6.indexOf("is"));
		 
		// 15.Write a Java program to search all occurrences of a character in given string.
		 
		 System.out.println(s4.toLowerCase());
		 System.out.println(s6.replaceAll("a", "i"));
		 System.out.println(s6.strip());
		 System.out.println(s6.replace(" ", ""));
	//21.	Write a Java program to toggle case of each character of a string.
		 
		 
		 System.out.println(s6.lastIndexOf("g"));
		 
		 
	}

}
