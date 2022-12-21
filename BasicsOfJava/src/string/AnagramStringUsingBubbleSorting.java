package string;

import java.util.Arrays;

public class AnagramStringUsingBubbleSorting {

	public static void main(String[] args) {

		String s1 = "Hello";
		String s2 ="hlelo";
     if(s1.length() == s2.length())
	  {
			char ch1 []= s1.toCharArray();
	 		char ch2 []= s2.toCharArray();
	 		
	 		for(int i = 0;i<ch1.length;i++)
	 		{
	 		  for(int j = 0;j<ch1.length-1;j++)
		 	  {
	 			if( ch1[j] > ch1[j+1])
	 			{
	 				char temp = ch1[j];
	 				ch1[j]= ch1[j+1];
	 				ch1[j+1] = temp;
	 			}
	 		}
	 	}
	 	System.out.println(Arrays.toString(ch1));
	 	
	 	   for(int i = 0;i<ch2.length;i++)
 		   {
 		      for(int j = 0;j<ch2.length-1;j++)
	 	      {
 			    if( ch2[j] > ch2[j+1])
 			   {
 				  char temp = ch2[j];
 				  ch2[j]= ch2[j+1];
 				  ch2[j+1] = temp;
 			    }
 		      }
 	       }
 	     System.out.println(Arrays.toString(ch2));

 	     int cnt = 0;
 	    for(int i = 0;i<ch2.length;i++)
		   {
 	    	  if(ch1[i] == ch2[i])
 	    	  {
 	    			cnt = 1;
			  }
		}
		if(cnt == 1)
		{
			System.out.println("Anagram");
		}
		else
		{
			System.out.println("Not Anagram");
		}
  }
     else
 	{
 		System.out.println("Different String length");
 	}
 	
 	
}
}