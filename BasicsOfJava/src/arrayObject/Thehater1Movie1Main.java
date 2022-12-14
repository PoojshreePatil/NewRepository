package arrayObject;

import java.util.Scanner;

public class Thehater1Movie1Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Theater1 thtr[] = new Theater1[1];
		
		for(int i= 0;i< thtr.length;i++)
		 {
			 System.out.println("Enter Id,Name");
			 int id = sc.nextInt();
			 String name =sc.next();
			// String dept = sc.next();
			// int marks = sc.nextInt();
			 
			 Theater1 t1 = new Theater1();
			t1.setId(id);
			t1.setName(name);
			//s.setDept(dept);
			//s.setMarks(marks);
			Movie1[] m= new Movie1[2] ;
			for(int j= 0;j< m.length;j++)
			 {
				System.out.println("Enter Id,Name,release year:");
				 int mid = sc.nextInt();
				 String mname =sc.next();
				 int mreleaseyr = sc.nextInt();
				 Movie1 m1= new Movie1();
				 m1.setId(1);
				 m1.setName(name);
				 m1.setReleaseyear(mreleaseyr);
				 
			    m[j] = m1;
			 }
			 thtr[i] = t1;
		 }
		for(Theater1 t : thtr)
		 {
			 System.out.println(t);
		 }
	}

}
