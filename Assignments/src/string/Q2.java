package string;

import java.util.Arrays;

public class Q2 {

	public static void main(String[] args) {

		/*
		 * 22. Write a Java program to count total number of vowels and consonants in a
		 * string. 
		 * 23. Write a Java program to find reverse of a string. 
		 * 24. Write a Java program to reverse order of words in a given string.
		 */
		
		
	/*	String s = "PooAjsIhreeuijksdgisu";
		
		char ch[] = s.toCharArray();
		int cnt = 0,cnt1 =0;
		for(int i = 0;i< ch.length;i++)
		{
			
			if(ch[i] == 'a' || ch[i] == 'A'|| ch[i] == 'e' || ch[i] == 'E'
					|| ch[i] == 'i' ||ch[i] == 'I' || ch[i] == 'o'
					||ch[i] == 'O'|| ch[i] == 'U'||ch[i] == 'u' )
			{
				cnt++;
			}
			else
			{
				cnt1++;
			}
		}
		System.out.println("No Of Vowels:"+cnt);
		System.out.println("No Of Consonant:"+cnt1);
		
		*/
		
		
	/*
	 * String s1 ="Kanak"; String rev=""; char ch[] = s1.toCharArray();
	 * System.out.println(Arrays.toString(ch)); for(int i =ch.length-1;i >= 0;i--) {
	 * rev = rev + ch[i]; } System.out.println(rev);
	 *//*
		 * 
		 * String s1 ="Never odd or even"; String s2[]=s1.split(" ");
		 * System.out.println(Arrays.toString(s2)); //char ch[] = s1.toCharArray();
		 * //System.out.println(Arrays.toString(ch));
		 * 
		 * for(int i =s2.length-1;i >= 0;i--) { System.out.print(s2[i]+" "); }
		 * 
		 */
		
		
		String s3 ="PiOiOEJbA";
		String s4[] = s3.split("");
         System.out.println(Arrays.toString(s4));
		for(int i =0;i < s4.length;i++)
		{  
		//	char a = 	s3.charAt(i) ;
			if(i % 2 != 0)
			{
				s4[i] = "@";
			}
		//	s3.charAt(i) = "*";
			System.out.print(s4[i]+" ");
		}
		// String s5 = new String(s4);
		 
		
	}

}








