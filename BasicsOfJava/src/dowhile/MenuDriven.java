package dowhile;

import java.util.Scanner;

public class MenuDriven {

	public static void main(String[] args) {

		int a,b;
		char c;
		Scanner sc= new Scanner(System.in);

		System.out.println("Enter Your Choice ");
		System.out.println("1.Addition \n 2. Subtraction \n 3. Multiplication \n 4.Division");
		
		int ch = sc.nextInt();
		//c = sc.next().charAt(0);
		
		do {
		   switch(ch)
		    {
		      case 1:
		    	System.out.println(" Enter Two Numbers: ");
		  		a = sc.nextInt();
		  		b = sc.nextInt();
		    	System.out.println("Addition is :  "+(a + b));
		    	break;
			
		      case 2:
		    	System.out.println(" Enter Two Numbers: ");
		  		a = sc.nextInt();
		  		b = sc.nextInt();
		    	System.out.println("Subtraction is :  "+(a - b));
		    	break;
		    	
		      case 3:
		    	System.out.println(" Enter Two Numbers: ");
		  		a = sc.nextInt();
		  		b = sc.nextInt();
		    	System.out.println("Multiplication is :  "+(a * b));
		    	break;
		    	
		      case 4:
		    	System.out.println(" Enter Two Numbers: ");
		  		a = sc.nextInt();
		  		b = sc.nextInt();
		    	System.out.println("Division is :  "+(a / b));
		    	break;
		    	
		    }	
		    	System.out.println("Do you want to Continue???(y/n)");
		        c = sc.next().charAt(0);
  		   
		}
		while(c == 'Y'|| c == 'y');
		sc.close();
	}

}
