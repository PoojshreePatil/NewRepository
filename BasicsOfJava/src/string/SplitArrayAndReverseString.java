package string;

import java.util.Arrays;

public class SplitArrayAndReverseString {

	public static void main(String[] args) {

		String s = "Java is a good Programming Language";
		
		String str[] = s.split(" ");
		System.out.println(Arrays.toString(str));
		for(int i =0;i<str.length;i++)
		{
		    char ch[] = str[i].toCharArray();
		    for(int j = str[i].length()-1 ;j>=0;j--)
		    {
		    	System.out.print(ch[j]);
		    	//char ch1[] = ch[j].toCharArray();
		    }
		System.out.print(" ");
		}
		//char ch1[] = str[i].toCharArray();
		/*
		 * for(int i =0;i<str.length;i++) 
		 * {
		 *  for(int j = str[i].length()-1 ;j>=0;j--)
		 *   {
		 *      System.out.println(str[i].charAt(j)); 
		 *     }
		 *   } 
		 *  System.out.println(" ");
		 */
	}

}
