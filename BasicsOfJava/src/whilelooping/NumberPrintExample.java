package whilelooping;

import java.util.Scanner;

public class NumberPrintExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int i=1,limit;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number limit:");
        limit = sc.nextInt();
        while(i<=limit)
        {
        	System.out.println(i);
        	i++;
        }
        System.out.println("Done");
        sc.close();
	}
 
}
