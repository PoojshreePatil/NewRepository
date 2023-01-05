package assignmentofswitch;

import java.util.Scanner;

public class SwitchCalculator {

	public static void main(String[] args) {
      
		int num ,no1,no2;
		Scanner sc = new Scanner(System.in);
		System.out.println(" 1-Addition\n 2-Subtraction \n 3-Multiplication \n 4-Division \n 5-Modulo Division");
		System.out.println("Enter two Numbers:");
		no1 = sc.nextInt();
		no2 = sc.nextInt();
		System.out.println("Enter your choice:");
		num = sc.nextInt();
		
		switch(num)
		{
		case 1 :
			int add = no1 + no2;
			System.out.println("Addition is:" +add);
			break;
			
		case 2:
			int sub = no1 - no2;
			System.out.println("Subtraction is:" +sub);
			break;
			
		case 3:
			int multi = no1 * no2;
			System.out.println("Multiplicaton is:" +multi);
			break;
			
		case 4:
			int divi = no1 / no2;
			System.out.println("Division is:" +divi);
			break;
			
		case 5:
			int mdivi = no1 % no2;
			System.out.println("Modulo Division is:" +mdivi);
			break;
			
		default:
			System.out.println("Enter valid choice");
				
		}
		sc.close();
	}

}
