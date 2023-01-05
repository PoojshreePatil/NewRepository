package assignmentofswitch;

import java.util.Scanner;

public class VowelOrConsonant {

	public static void main(String[] args) {
     char ch;
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter your choice:");
	 ch = sc.next().charAt(0);
	 
	 switch(ch)
	 {
	   case 'a':
		 
	   case 'A':
		  
	   case 'e':
		 
	   case 'E':
		  
	   case 'i':
		   
	   case 'I':
		   
	   case 'o':
		   
	   case 'O': 
		   
	   case 'u':
		   
	   case 'U':
		    System.out.println(ch + " It is Vowel");
		    break;
	 default:
		    System.out.println(ch + " It is consonant");
		
	 }
			 
	sc.close();		 
			 
	}

}
