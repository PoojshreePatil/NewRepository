package whilelooping;

import java.util.Scanner;

public class TableOfNumbers {

	public static void main(String[] args) {
       
		int i=1, num,table;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		num = sc.nextInt();
		
		while(i <= 10)
		{
		    table= num * i;
			System.out.println(table);
			i++;
		}
		sc.close();
	}
}
			
