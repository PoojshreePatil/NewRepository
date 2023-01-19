package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

import classesandobject.EmployeeDetails1;

public class ArrayListOfObject {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		ArrayList<Student1> s = new ArrayList();
		
		System.out.println("Enter the Size Of ArrayList: ");
		int asize = sc.nextInt();
		
		for(int i = 0;i< asize;i++)
		{
			System.out.println("Enter Student Id,Name,marks,Department:");
			int id = sc.nextInt();
			String name = sc.next();
			int marks = sc.nextInt();
			String dept = sc.next();
			
			Student1 s1 = new Student1();
			s1.setId(id);
			s1.setName(name);
			s1.setMarks(marks);
			s1.setDept(dept);
			
			s.add(s1);
			
		}
		
		for(Student1 st : s)
		{
		 	System.out.println(st);
			
			/*
			 * if(st.getDept().equalsIgnoreCase("Computer")) { System.out.println(st); }
			 * if(st.getDept().equalsIgnoreCase("Entc")) { st.setMarks(st.getMarks()+2);
			 * System.out.println(st.getMarks()); }
			 
			if(st.getMarks()== 90)
			{
				System.out.println(st);
			}
			
			if(st.getName().startsWith("R") || st.getName().startsWith("r"))
			{
				System.out.println(st);
			}
			*/
		}
		
		
		
		//System.out.println(s);
	}

}
