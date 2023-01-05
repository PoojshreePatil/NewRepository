package basicassignment;

import java.util.Scanner;

public class FahrenheitToCelcius {

	public static void main(String[] args) {

		double f;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
	    f = sc.nextInt();
		
		double celcius = (f-32)*5/9;
		
		System.out.println(celcius);
		sc.close();
	}

}
