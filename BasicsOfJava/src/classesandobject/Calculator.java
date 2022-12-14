package classesandobject;

import java.util.Scanner;

public class Calculator {
	
		void add()
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Two Numbers:");
			int a=sc.nextInt();
			int b= sc.nextInt();
			
			System.out.println("Addition is: "+(a+b));
		}
		void substract()
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Two Numbers:");
			int a=sc.nextInt();
			int b= sc.nextInt();
			
			System.out.println("Substraction is: "+(a-b));
		}
		void multi()
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Two Numbers:");
			int a=sc.nextInt();
			int b= sc.nextInt();
			
			System.out.println("Multiplication is: "+(a*b));
		}
		void divi()
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Two Numbers:");
			int a=sc.nextInt();
			int b= sc.nextInt();
			
			System.out.println("Division is: "+(a/b));
		}
}
