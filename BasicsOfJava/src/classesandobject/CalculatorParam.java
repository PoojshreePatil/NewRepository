package classesandobject;

import java.util.Scanner;

public class CalculatorParam {

	void add(int a, int b)
	{
		System.out.println("Addition is: " +(a+b));
	}
	void subtract(int a,int b)
	{
		System.out.println("Substraction is: "+(a-b));
	}
	void multiply(int a, int b)
	{
		System.out.println("Multiplication is: "+(a*b));
	}
	void division(float a, int b)
	{
		System.out.println("Division is: "+(a/b));
	}
	
	public static void main(String[] args) {
		
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Two Numbers:");
		a = sc.nextInt();
		b = sc.nextInt();
		
		CalculatorParam c = new CalculatorParam();
		 c.add(a, b);
		 c.subtract(a, b);
		 c.multiply(a,b);
		 c.division(a, b);
		 
		 

	}

}
