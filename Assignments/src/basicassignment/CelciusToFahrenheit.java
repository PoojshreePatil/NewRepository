package basicassignment;

import java.util.Scanner;

public class CelciusToFahrenheit {

	public static void main(String[] args) {

		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		num = sc.nextInt();
		 
		double f = (num*9/5)+32; 

		System.out.println(num+ " Celcius is Converted into Fahrenheit is : " +f+"F");
		
		sc.close();
	}

}
