package classesandobject;

import java.util.Scanner;

public class BonusPFCalculator {

	float bonus(int salary,char ch)
	{
		float newSal;
		System.out.println("Original Salary is:"+salary);
		if( ch == 'A')
			newSal = salary + (salary*0.15f);
		
		else if( ch == 'B')
			newSal = salary + (salary*0.10f);
		else if( ch == 'C')
			newSal = salary + (salary*0.05f);
		else
			newSal = salary ;
		
		System.out.println("Salary After adding Bonus: "+newSal);
		return newSal;
		
	}
	void pfCalculator (float salary)
	{
		//float salary;
		System.out.println("Pf Salary: "+(salary *0.15f));

	}
	
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Salary:");
		int sal =sc.nextInt();
		System.out.println("Enter the employee rate (A/B/C/D)");
		char c = sc.next().charAt(0);
		BonusPFCalculator bpc = new BonusPFCalculator();
		 float newSal = bpc.bonus(sal,c);
		 bpc.pfCalculator(newSal);
		 
		
	}

}
