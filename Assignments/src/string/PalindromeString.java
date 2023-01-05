package string;

import java.util.Arrays;

public class PalindromeString {

	public static void main(String[] args) {

		String s = "Kanak";
		
		String s1[] = s.split("");
		String st1="";
		System.out.println(Arrays.toString(s1));
		for(int i = s1.length-1;i>=0;i--)
		{
			st1 = st1 +s1[i];
		}
		System.out.println(st1);
		if(st1.equalsIgnoreCase(s))
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not palindrome");
		}

	}

}
