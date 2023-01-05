package basicassignment;

import java.util.Scanner;

public class PerimeterOfRectangle {

	public static void main(String[] args) {
  
		int l,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length: ");
		l = sc.nextInt();
		System.out.println("Enter the Breadth: ");
        b = sc.nextInt();
        
        int perimeter = 2 * (l + b);
        
		System.out.println("Perimeter Of Rectangle is:: " +perimeter);
		sc.close();

	}

}
