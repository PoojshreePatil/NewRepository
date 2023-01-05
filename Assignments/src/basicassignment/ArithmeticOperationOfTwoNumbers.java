package basicassignment;

import java.util.Scanner;

public class ArithmeticOperationOfTwoNumbers {

	public static void main(String[] args) {
   
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Two Numbers:");
		a = sc.nextInt();
		b = sc.nextInt();
		
		int sum=a+b;
		System.out.println("Addition Of 2 Numbers: " +sum);
		
		int sub = a-b;
		System.out.println("Substraction Of 2 Numbers: " +sub);
		
		int multi = a * b;
		System.out.println("Multiplication Of 2 Numbers: " +multi);
		
		int div=a/b;
		System.out.println("Division Of 2 Numbers: " + div);
		
		int mdiv = a % b;
		System.out.println("Modulo Division  Of 2 Numbers: " +mdiv);
		
		sc.close();
	}

}
