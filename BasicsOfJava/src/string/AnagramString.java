package string;

import java.util.Arrays;

public class AnagramString {

	public static void main(String[] args) {

		String s1 = "Hello";
		String s2 ="Hlelo";
	if(s1.length() == s2.length())
	{
			char ch1 []= s1.toCharArray();
			char ch2 []= s1.toCharArray();
			
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			
			System.out.println(Arrays.toString(ch1));
			System.out.println(Arrays.toString(ch2));
			
			int cnt = 0;
			for(int i = 0;i< s1.length();i++)
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
