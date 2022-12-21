package string;

import java.util.Arrays;

public class Q4 {

	public static void main(String[] args) {

		String s = "The core Java is a Java programming Language ";
		
		String s1[] =s.split(" ");
		int count = 0;
		System.out.println(Arrays.toString(s1));
		for(int i= 0;i< s1.length;i++)         //the  core i =2java
		{
			for(int j= i+1;j < s1.length;j++)  //core 
			{
				if(s1[i].equalsIgnoreCase(s1[j]))
				{
					continue;
					
					//System.out.print(s1[i]+" ");
				}
				continue;
			}
			 System.out.print(s1[i]+" ");
			
		}
	//    System.out.println(Arrays.toString(s1));
	}
}



