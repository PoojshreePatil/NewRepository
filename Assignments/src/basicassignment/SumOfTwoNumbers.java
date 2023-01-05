package basicassignment;

import java.util.Scanner;

public class SumOfTwoNumbers {

	public static void main(String[] args) {
      
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Two Numbers:");
		a = sc.nextInt();
		b = sc.nextInt();
		
		int sum = a +b;
		System.out.println("Sum Of Two Numbers is:" +sum);
		sc.close();
	}

}
