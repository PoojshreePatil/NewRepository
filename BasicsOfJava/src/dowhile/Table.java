package dowhile;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {

		int i=1,num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
	    num = sc.nextInt();
		do
		{
			System.out.println(num * i);
	        i++;
		}   
		while(i<=10);
        sc.close();
}
}