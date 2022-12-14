package classesandobject;

import java.util.Scanner;

public class Student {

	 int id,marks;
     String name,dept;
     
     void setData()
     {
   	    Scanner sc = new Scanner(System.in);
   	    System.out.println("Enter Id:");
   	    id = sc.nextInt();
   	    System.out.println(" Enter Name:");
	    name = sc.next();
	    System.out.println("Enter marks:");
	    marks = sc.nextInt();
	    System.out.println("Enter Department:");
   	    dept = sc.next();
   	    
     }
     void display()
     {
    	 System.out.println(id+" "+name+" "+marks+" "+dept+" ");
     }
	
	public static void main(String[] args) {

		Student s1 = new Student();
		s1.setData();
		Student s2 = new Student();
		s2.setData();
		Student s3 = new Student();
		s3.setData();
		
		s1.display();
		s2.display();
		s3.display();

}
}