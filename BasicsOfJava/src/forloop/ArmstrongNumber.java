package forloop;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {

		int sum =0;/*int num;int cnt=0;int sum =0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		num = sc.nextInt();*/
		for(int num =1;num<=200;num++)
		{
		int temp=num;
		int cnt=0;
		while(temp != 0)
		{
		
			cnt++;
			temp=temp /10;
		}
		//System.out.println(cnt);
		
		int temp1 =num;
		while(temp1 != 0)
		{
			int power = 1;
			int rem =temp1% 10;
			
			for(int i=1;i<=cnt;i++)
			{
				power = power*rem;
			}
			sum =sum +power;
			temp1 = temp1 /10;
		}
		
		if(sum == num)
		{
			System.out.println(sum);//+ " is ArmStrog Number");
			
		}
		/*else
		{
			System.out.println(sum + " is Not Armstrong Number");
		}*/
		//sc.close();
		//System.out.println();
	}
	}
}
