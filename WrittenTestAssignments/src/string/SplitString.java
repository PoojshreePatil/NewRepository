package string;

import java.util.Arrays;

public class SplitString {

	public static void main(String[] args) {

		String s = "HELLO@WORLD";
		
		String s1[] = s.split("@");
		
	     System.out.println(Arrays.toString(s1));
	     
		
		  for(int i =0;i< s1.length;i++)
		  {
			  System.out.print(s1[i]+" ");
	   	  }
	}
} 
		/*
		 * char ch[] = s.toCharArray(); int sum = 0; for(int i = 0;i< ch.length;i++) {
		 * sum = sum + (ch[i]-64); } System.out.println(sum);
		 */
		


