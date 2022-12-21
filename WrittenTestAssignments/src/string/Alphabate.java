package string;

import java.util.Arrays;

public class Alphabate {

	public static void main(String[] args) {
		//String s ="POOJSHREE";
		//char ch[] = s.toCharArray();
		//String s1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		//String s ="KITE";
		//String s1[] =s.split(" ");
		
		// System.out.println(Arrays.toString(s1));
			
		  //for(int i = 0;i< s1.length;i++)
			/*
			 * //{ int sum = 0; char ch[] = s.toCharArray(); for(int i = 0;i< ch.length;i++)
			 * { // int sum = 0; int a =ch[i]-64; sum = sum + a; //(ch[j]-64);
			 * 
			 * System.out.println(a+" "); // System.out.println(ch[i]); }
			 * System.out.println(s+": " +sum); // System.out.println(ch[i]+":" +sum +" ");
			 */
		
		
		
			
			  String s ="THE SKY IS THE LIMIT";
			  String s1[] =s.split(" ");
			  
			  System.out.println(Arrays.toString(s1));
			  
			  for(int i = 0;i< s1.length;i++)
			  { 
				  int sum = 0; 
				  char ch[] =s1[i].toCharArray();
				  for(int j = 0;j< ch.length;j++)
				  { 
					
					      int a = ch[j]-64;
						  sum = sum + a;
				 
				} System.out.print(s1[i]+":" +sum +" ");
			}
			 
	}
}






