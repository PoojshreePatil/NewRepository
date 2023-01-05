package assignment3;

import java.util.Scanner;

public class Q7 {

	int a,b;
	
	int addition(int a,int b)
	{
		int add = a+b;
		return add;
	}
	
	int substraction(int a,int b)
	{
		int sub = a - b;
		return sub;
	}
	
	int multiplication(int a,int b)
	{
		int multi = a* b;
		return multi;
	}
	
	float division(int a, int b)
	{
		float divi = a / b;
		return divi;
	}
	
	void display(int add,int sub,int multi,float divi)
	{
		System.out.println("Addition is:"+add);
		System.out.println("Substraction is:"+sub);
		System.out.println("Multiplication is:"+multi);
		System.out.println("Division is:"+divi);
		
	}
	public static void main(String[] args) {
       
		Q7 q = new Q7();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter two Numbers:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int add = q.addition(a,b);
	    int sub = q.substraction(a, b);
		int multi = q.multiplication(a, b);
		float divi = q.division(a, b);
		q.display(add,sub,multi,divi);
		
		sc.close();
	}
}






/*int a = 20;
int b = 10;
int add = q.addition(a,b);
int sub = q.substraction(a, b);
int multi = q.multiplication(a, b);
float divi = q.division(a, b);
q.display(add,sub,multi,divi);

}
*/