package com.dao;

import java.util.Arrays;
import java.util.Scanner;

import com.pojo.Employee1;

public class EmployeeOperation1 {
	Scanner sc = new Scanner(System.in);
	Employee1 e[] = new Employee1[10];
	private int id;
	
	 public void mainArray()
	 {
		 System.out.println("Number of Employees you want to add");
		 int size = sc.nextInt();
    	for(int i = 0;i< size;i++)
	   {
		System.out.println("Enter id,name,salary,email,dept");
		
		int id = sc.nextInt();
		String name = sc.next();
		int salary = sc.nextInt();
		String dept = sc.next();
		String email = sc.next();
		
		Employee1 e1 = new Employee1(id, salary, name, dept, email);
	
		e[i] = e1;
	   }
	 }
	 public void display()
	 {
		 System.out.println(Arrays.toString(e));
	 }
	 public void search()
	 {
		 System.out.println("Enter Id:");
		 int eid = sc.nextInt();
		 for(int i = 0;i< e.length;i++)
		 {
			if(e[i] != null)
	 		{
	 		 if(id == eid)
			  {
				 System.out.println(e[i]);
			  }
	 		}
		 }
	 }
}
