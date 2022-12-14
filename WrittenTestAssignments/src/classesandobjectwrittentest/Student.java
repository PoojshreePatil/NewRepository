package classesandobjectwrittentest;

import java.util.Scanner;

public class Student {
    
	int m1,m2,m3;
	
	void marks()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 3 Subject Marks");
		m1= sc.nextInt();
		m2= sc.nextInt();
		m3= sc.nextInt();
		//int total = m1 + m2 + m3;
		//return total;
		
		
	}
	float calpercent()
	{
		float percentage = (m1 + m2 + m3) /3 ;
		System.out.println("Percentage :" + percentage +" %");
		
		return percentage;
	}
	
	void result(float percentage)
	{
		if( percentage >= 75)
		{
			System.out.println("Distinction");
		}
		else if( percentage >= 60)
		{
			System.out.println(" First class");
		}
		else if( percentage >= 50)
		{
			System.out.println("Second class");
		}
		else if( percentage >=35)
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		
	}
	public static void main(String[] args) {
		
		Student s = new Student();
		s.marks();
		float calpercent1 = s.calpercent();
	    s.result(calpercent1);

	}

}
