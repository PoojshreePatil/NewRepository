package classesandobject;

import java.util.Scanner;

public class Calculatorpf {

	
	void pfcalculator(int salary)
	{
		int totalsalary;
		totalsalary = salary*15/100;
		System.out.println("Total Salary is :" +totalsalary);
		
		
	}
	public static void main(String[] args) {

		int salary;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Salary:");
		salary = sc.nextInt();
		
		Calculatorpf c = new Calculatorpf();
		c.pfcalculator(salary);
		
	}

}
