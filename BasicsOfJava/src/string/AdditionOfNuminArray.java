package string;

import java.util.Arrays;

public class AdditionOfNuminArray {

	public static void main(String[] args) {

		String s = "Java5Core6Language4";
		int sum = 0;
		char ch[] = s.toCharArray();
	
		/*
		 * for(int i = 0;i< s.length();i++) { if(ch[i] <= 58) {
		 * System.out.println(ch[i]); sum = sum + (ch[i] - 48); } }
		 * 
		 * System.out.println(sum);
		 */
		
		for(int i = 0;i< ch.length;i++)
		  {
			   if(ch[i] >= '0' && ch[i] <= '9') 
			   {
		            System.out.println(ch[i]); 
		            sum = sum + (ch[i] - 48); 
		       }
		  }
		System.out.println(sum);
		
		/*
		 * for(int i = 0;i< s.length();i++) { if(s.charAt(i) <= 58) {
		 * System.out.println(s.charAt(i)); sum = sum + (s.charAt(i)-48); } }
		 * System.out.println(sum);
		 */
	}

}
