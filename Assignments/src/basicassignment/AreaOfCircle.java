package basicassignment;

import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args) {

		float rad,pi = 3.14f;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius: ");
		rad = sc.nextFloat();
		
		float diameter = 2* rad;
		System.out.println("Diameter Of Circle is : "+diameter);
		
		double circumference = 2*pi*rad;
		System.out.println("Circumference Of Circle : "+circumference);

		double area = pi*rad *rad;
		System.out.println("Area Of Circle : " +area);


		sc.close();

	}

}
