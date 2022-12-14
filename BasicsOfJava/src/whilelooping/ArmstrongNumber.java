package whilelooping;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
       
		int rem = 0 ,sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int num = sc.nextInt();
		int temp = num;
		while(num != 0)
		{
			rem = num % 10;
			sum += rem *rem * rem;
			num = num / 10;
		}
		if(temp == sum)
		{
		System.out.println(temp + " is Armstrong Number");
		}
		else
		{
			System.out.println(temp + " is  Not Armstrong Number");
		}
		
		sc.close();
	}

}
