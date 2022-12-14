package whilelooping;

import java.util.Scanner;

public class CountNumber {

	public static void main(String[] args) {
 
		int num,rem=0,cnt=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		num = sc.nextInt();
		while(num != 0)
		{
			rem = num % 10;
			cnt++;
			num= num/10;
		}
		System.out.println("Count Of Number is:" +cnt);
		sc.close();
	}

}
