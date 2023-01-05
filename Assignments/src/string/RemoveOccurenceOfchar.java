package string;

import java.util.Arrays;

public class RemoveOccurenceOfchar {

	public static void main(String[] args) {

		String s ="Poojashreepatil";
		//String ch1 ="patil";
		String s1[] = s.split("");
		
		System.out.println(Arrays.toString(s1));
		
		char ch1 ='a';
		 char ch[] = s.toCharArray(); 
		
		  for(int i = 0;i< ch.length; i++)
		  {
			  if(ch[i] != ch1)
			  {
		         System.out.print(ch[i]);
		       }
			}
		 
		
	}

}
