package classesandobject;

import java.util.Scanner;

public class Returntypeeg {

	int s1,s2,s3;
	
	int marks()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks:");
		s1 = sc.nextInt();
		s2 = sc.nextInt();
		s3 = sc.nextInt();
		 int total = s1+s2+s3;
		 //System.out.println("total:"+total);
		 return total;
	}
	float percentage(int total)
	{
		float percent = total / 3;
		//System.out.println("Percentage:"+percent);
	    return percent;	 
	}
	
	void display(int total,float percent)
	{
		System.out.println("Total is:"+total);
		System.out.println("Percentage"+percent);
	}
	
	public static void main(String[] args) {

		Returntypeeg r = new Returntypeeg();
		int total = r.marks();
		float percent = r.percentage(total);
        r.display(total, percent);
	}

}
