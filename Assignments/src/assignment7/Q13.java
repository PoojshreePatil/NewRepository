package assignment7;

import java.util.Arrays;

public class Q13 {
	/*
	 * 13.Write a program to sort array of string in descending order of string
	 * length. If two strings have same length sort them in ascending order of
	 * alphabets. E.g. String [] sarr = {“hi”, “how”, “are”, “you”, “doing”} Output
	 * will be {“doing”, “are”, “how”, “you”, “hi”}
	 */
	public static void main(String[] args) {
       
		 String sarr[] = {"hi", "how", "are", "you", "doing"};
		//	System.out.println(Arrays.toString(null)));
			
			for(int s1= 0; s1< sarr.length;s1++)
			{
				for(int j = 0;j< sarr.length -1;j++)
				{
					if(sarr[j].compareTo(sarr[j + 1]) > 0  )
					{
						String temp = sarr[j];
						sarr[j] = sarr[j + 1];
						sarr[j+1] = temp;
					}
				}
				
			}
			System.out.println(Arrays.toString(sarr));
		
	}

}
