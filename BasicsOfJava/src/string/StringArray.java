package string;

import java.util.Arrays;

public class StringArray {

	public static void main(String[] args) {

		String s[] = {"Yash Raj","Aadya","Veer","Rahul","Anjali","Ajay","Leena","Veena"};
	
		for(int i = 0;i< s.length;i++)
		{
			System.out.println(s[i]+" = "+s[i].length());
		}

		for(int i = 0;i< s.length;i++)
		{
			char ch[] = s[i].toCharArray();
			if(ch[0] == 'R')
			{
				String st = new String(ch);
			    System.out.println(st);
		    }
		}
		
		
		for(int i = 0;i< s.length;i++)
		{
			if(s[i].startsWith("R"))
			{
			  System.out.println(s[i]);
	    	}
		}
		System.out.println("Contained elements");
		for(int i = 0;i< s.length;i++)
		{
			if(s[i].contains("ee"))
			{
			  System.out.println(s[i]);
	    	}
		}
		
		for(int i = 0;i< s.length ;i++)
		{
			char ch1[] = s[i].toCharArray();
			if(ch1[i] == 'j')
			{
				String st1 = new String(ch1);
			    System.out.println(st1);
		    }
		}
		
		
		System.out.println("Sorting Array");
		for(int i = 0;i< s.length;i++)
		{
			for(int j = 0;j< s.length - 1;j++)
			{

			  if(s[j].compareTo(s[j+1]) > 0)
			   {
				  String temp = s[j];
				  s[j]= s[j+1];
				  s[j+1] = temp;
			     // System.out.println(s[j]);
	    	   }
			 // System.out.println(s[j]);
	       	}
		}
		
		System.out.println(Arrays.toString(s));
	}

}
