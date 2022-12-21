package string;

import java.util.Arrays;

public class Que4 {

	public static void main(String[] args) {

		String s = "The core Java is a Java programming Language ";
		
		String s1[] = s.split(" ");
		
		System.out.println(Arrays.toString(s1));
		
		for(int i =0;i<s1.length;i++)
		{
			for(int j = i+1;j< s1.length;j++)
			{
				if(s1[i].equals(s1[j]))
				{
					continue;
				  //System.out.print(s1[j]+" ");
				}
				
				/*
				 * else { System.out.print(s1[j]+" "); }
				 */
			}
		//System.out.print(s1[i]+" ");
		}
		 
	}

}
