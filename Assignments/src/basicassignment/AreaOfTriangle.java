package basicassignment;

import java.util.Scanner;

public class AreaOfTriangle {

	public static void main(String[] args) {

		float b,h;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of breadth:");
		b = sc.nextFloat();
		System.out.println("Enter the value of height:");
		h = sc.nextFloat();
		
		double area = (b*h)/2;
		System.out.println("Area Of Triangle:" +area);
	
	sc.close();
	}
}
