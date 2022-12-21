package string;

import java.util.Arrays;

public class String2 {

	public static void main(String[] args) {

		String s1 = "hi   ";
		String s2 = "Hello";
		String s3 = "how  ";
		
		char ch1[] = s1.toCharArray();
		char ch2[] = s2.toCharArray();
		char ch3[] = s3.toCharArray();
		
		for(int i = 0;i<ch2.length;i++)
		{
			System.out.println(ch2[i]+""+ch3[i]+""+ch1[i]+"");
		}
		
		/*
		 * for(int j = i+1;j<ch3.length;j++)
			{
				for(int k =j+1;k<ch1.length;k++)
				{
			       System.out.println(ch1[k]+"");
			       //break;
				}
			       System.out.println(ch3[j]+"");
			}
			System.out.println(ch2[i]+"");
			
			
		 * String s4 = s1+s2+s3; System.out.println(s4);
		 * 
		 * int i = 0; System.out.print(s1.charAt(i)); System.out.print(s2.charAt(i));
		 * System.out.println(s3.charAt(i)); i++; System.out.print(s1.charAt(i));
		 * System.out.print(s2.charAt(i)); System.out.println(s3.charAt(i));
		 * 
		 * i++;
		 * 
		 * System.out.print(s2.charAt(i)); System.out.println(s3.charAt(i));
		 * 
		 * i++; System.out.println(s2.charAt(i));
		 * 
		 * i++; System.out.println(s2.charAt(i));
		 */
	}	
	}
