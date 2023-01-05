package forloop;

import java.util.Scanner;

public class Power {

	public static void main(String[] args) {

		int base,power;
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the value of base:");
	    base = sc.nextInt();
		System.out.println("Enter the value of power:");
		power = sc.nextInt();
		int total=1;
		
		for(int i=1;i<=power;i++)
		{
			total = total*base;
			
		}
		System.out.println("Power Of Base is:" +total);
	}

}
