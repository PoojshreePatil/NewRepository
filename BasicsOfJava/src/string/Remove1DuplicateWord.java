package string;

import java.util.Arrays;

public class Remove1DuplicateWord {

	public static void main(String[] args) {

		String s = "Java  is core Java is advance language";
		
		String s1[]= s.split(" ");
		String s2 =" ";
		System.out.println(Arrays.toString(s1));
		
		for(int i = 0;i < s1.length;i++)
		{
			int cnt = 0;
			for(int j = i +1;j < s1.length;j++)
			{
			   if(s1[j].equalsIgnoreCase(s1[i]))
			   {
				   s1[j] = "0";
			   }
		    }
			if(!s1[i].equals("0"))
			{
				s2 = s2 + s1[i]+" ";
			}
		}
			System.out.println(s2);
	}
}
