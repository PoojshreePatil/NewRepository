package basicassignment;

import java.util.Scanner;

public class AreaOfRectangle {

	public static void main(String[] args) {

		int l,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length: ");
        l = sc.nextInt();
		System.out.println("Enter the breadth: ");
        b = sc.nextInt();
        
        int area = l * b;
		System.out.println("Area Of Rectangle is : "+area);
		sc.close();

	}

}
