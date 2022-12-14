package classesandobjectwrittentest;

import java.util.Scanner;

public class Box1 {

	int length,width,height;
	void calculateVolume()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length,width,height of Box: ");
		System.out.println(" Enter a length:");
		 length = sc.nextInt();
		 System.out.println("Enter a width:");
		 width = sc.nextInt();
		 System.out.println("Enter a height:");
		 height = sc.nextInt();
		
		int volume = length * width * height;
		System.out.println("Volume of Box is: "+ volume);
		
	}
	public static void main(String[] args) {

		Box1 b = new Box1();
	    b.calculateVolume();
	}

}
