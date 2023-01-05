package basicassignment;

import java.util.Scanner;

public class AreaOfEquivalentRectangle {

	public static void main(String[] args) {
       float a;
       Scanner sc = new Scanner(System.in);
		System.out.println("Enter side: ");
		a = sc.nextInt();
		 
		double area=  0.433 * a *a;
		System.out.println("Area Of Equivalent Rectangle is :" +area);
   sc.close();
	}

}
