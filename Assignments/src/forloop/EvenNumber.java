package forloop;

import java.util.Scanner;

public class EvenNumber {

	public static void main(String[] args) {

		int  i,num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		num = sc.nextInt();
	
		for(i =121; i <=num;i++)
		{
			if(i % 2==0)
			{
				System.out.println(i);
			}
		}
		sc.close();
	}

}
