package whilelooping;

import java.util.Scanner;

public class MinMaxDigitOfNumber {

	public static void main(String[] args) {
     
		int num,rem;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		num = sc.nextInt();
		
		int min = num % 10;
		int max = num % 10;
		
		while(num != 0)
		{
			rem = num % 10;
			if(rem<min)
			{
				min = rem;
			}
			if(max < rem)
			{
				max = rem;
			}
			num = num / 10;
		}
		System.out.println("Minimum Number is:"+min);
		System.out.println("Maximum Number is:"+max);
        sc.close();
	}

}
