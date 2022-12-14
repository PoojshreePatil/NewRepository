import java.util.Scanner;
public class MenuDriven {

	public static void main(String[] args) {

		int a,b;
		Scanner sc= new Scanner(System.in);
		System.out.println("1.Addition \n 2. Subtraction \n 3. Multiplication \n 4.Division");
		System.out.println(" Enter Two Numbers: ");
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println("Enter Your Choice ");
		int ch = sc.nextInt();
		
		switch(ch)
		{
		  case 1:
		    	System.out.println("Addition is :  "+(a + b));
		    	break;
			
		  case 2:
		    	System.out.println("Subtraction is :  "+(a - b));
		    	break;
		    	
		  case 3:
		    	System.out.println("Multiplication is :  "+(a * b));
		    	break;
		    	
		  case 4:
		    	System.out.println("Division is :  "+(a / b));
		    	break;
		    	
  		}
		 sc.close();
	}

}
