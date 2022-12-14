package classesandobjectwrittentest;

import java.util.Scanner;

public class StudentInfo {

	int id;
	String sname;
	int s1,s2,s3,percentage;
	Scanner sc = new Scanner(System.in);
  void accept()
	{
		
		System.out.println(" ****Accept the Student Information****\n");
		System.out.println("Enter the Student Id:");
		id = sc.nextInt();
		System.out.println("Enter the Student name:");
		sname = sc.next();
		System.out.println("Enter the 3 subject marks:");
		
		s1 = sc.nextInt();
		s2 = sc.nextInt();
		s3 = sc.nextInt();
		
	}
	void calculate()
	{
		int total;
		total = s1 + s2 + s3;
		percentage = total / 3;
		//System.out.println("\nPercentage is :" + percentage);
	}
	
	void display()
	{
		System.out.println("\n*******Student Information Is******\n");
		System.out.println("Student Id: "+id);
		System.out.println("Student Name:"+sname);
		System.out.println("Three Subject Marks :");
		System.out.println("Marathi :" + s1);
		System.out.println("Hindi :" + s2);
		System.out.println("English :"+s3);
		System.out.println("Percentage : "+percentage);
	
	}
	
	/*
	 * public String toString() { return id+" "+sname+" "+percentage+" "; }
	 */
	public static void main(String[] args) {
      
		StudentInfo  s = new StudentInfo();
		s.accept();
		s.calculate();
		s.display();
		//System.out.println(s);
	}

}
