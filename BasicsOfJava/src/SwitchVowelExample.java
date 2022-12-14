import java.util.Scanner;
public class SwitchVowelExample {

	public static void main(String[] args) {
      
		char ch;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the character:");
		ch = sc.next().charAt(0);
		
		switch(ch)
		{
		  case 'a':
			 
		  case 'e':
			   
		  case 'i':
			   
		  case 'o':
			  
		  case 'u':
			   
		  case 'A':
			  
		  case 'E':
			  
		  case 'I':
			  
		  case 'O':
			  
		  case 'U':
			    System.out.println(ch+ " is Vowel");
              break;
              
          default:
        	  System.out.println(ch+ " is Consonant ");
            
		}
		sc.close();
	}

}
















/*

import java.util.Scanner;
public class SwitchVowelExample {

	public static void main(String[] args) {
      
		char ch;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the character:");
		ch = sc.next().charAt(0);
		
		switch(ch)
		{
		  case 'a':
			    System.out.println(ch+ " is Vowel");
                break;
            
		  case 'e':
			    System.out.println(ch+ " is Vowel");
              break; 
            
		  case 'i':
			    System.out.println(ch+ " is Vowel");
              break; 
            
		  case 'o':
			    System.out.println(ch+ " is Vowel");
              break; 
            
		  case 'u':
			    System.out.println(ch+ " is Vowel");
              break;  
            
		  case 'A':
			    System.out.println(ch+ " is Vowel");
              break;
              
		  case 'E':
			    System.out.println(ch+ " is Vowel");
              break;
            
		  case 'I':
			    System.out.println(ch+ " is Vowel");
              break;
              
		  case 'O':
			    System.out.println(ch+ " is Vowel");
              break;
              
		  case 'U':
			    System.out.println(ch+ " is Vowel");
              break;
              
          default:
        	  System.out.println(ch+ " is Consonant ");
            
		}
		sc.close();
	}

}
*/
