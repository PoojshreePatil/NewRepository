package forloop;

import java.util.Scanner;

public class KrishnmurthyNumber {

	public static void main(String[] args) {

		 int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number :");
		int num = sc.nextInt();
		int temp = num;
		while(num != 0)
		{
			 int rem = num % 10;
			 int fact = 1;
			
			 for(int i = 1;i <=rem;i++)
			 {
				 fact = fact*i;
			 }
			 num = num / 10;
			 sum = sum + fact;
		
		}
		//System.out.println(sum);
		 if(temp == sum)
		 {
			 System.out.println(temp +" is Krishnmurthy Number");
		 }
		 else
		 {
			 System.out.println(temp + " is not Krishnmurthy Number");
		 }
		 sc.close();
	}

}
