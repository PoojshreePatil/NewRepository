package assignmentofswitch;

import java.util.Scanner;

public class GreatestNumber {

	public static void main(String[] args) {

		int num1,num2;
		boolean flag;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Two Numbers");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
	   
	    if(num1 > num2)
		{
			flag = true;
		}
		else {
			flag = false;
		}
	    int val = (flag) ? 0: 1;
		switch(val)
		{
		   case 0:
			   System.out.println(num1+ " is Greatest Number");
			   break;
				   
		   case 1:
			   System.out.println(num2+ " is Greatest Number");
			   break;
			   
		   default:
		   System.out.println("Both are equal");
		  
		}
		sc.close();
	}

}
