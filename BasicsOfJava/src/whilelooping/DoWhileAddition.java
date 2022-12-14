package whilelooping;

import java.util.Scanner;

public class DoWhileAddition {

	public static void main(String[] args) {

		int a,b;
		char ch;
		Scanner sc = new Scanner(System.in);
		
		do 
		{
			System.out.println("Enter 2 numbers :");
			a = sc.nextInt();
			b =sc.nextInt();
			
			System.out.println("Addition is:" +(a+b));
			
			System.out.println("Do you want to Continue????(y/n)");
			ch = sc.next().charAt(0);
		}while(ch=='Y' || ch =='y');
		sc.close();
	}

}
