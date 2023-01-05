package assignmentofswitch;

import java.util.Scanner;

public class EvenOddSwitch {

	public static void main(String[] args) {

		String sname;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your choice:");
		sname = sc.nextLine();
		sname= sname.toLowerCase();
		int num ;
		System.out.println("Enter the Number :");
		num = sc.nextInt();
		
		switch(sname)
		{
		  case "even":
			/*int num ;
			System.out.println("Enter the Number :");
			num = sc.nextInt();*/
			if(num % 2 == 0)
			{
				System.out.println(num + " Number is Even");
			}
			
			break;
			
		  case "odd":
			/*int num ;
			System.out.println("Enter the Number :");
			num = sc.nextInt();*/
			if(num % 2 == 0)
			{
				System.out.println(num + "Number is Even");
			}
			break;
			
			default:
				System.out.println("Enter valid choice:");
			
		}
		sc.close();
	}

}
