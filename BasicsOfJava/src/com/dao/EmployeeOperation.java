package com.dao;

import java.util.Arrays;
import java.util.Scanner;

import com.pojo.Employee;

public class EmployeeOperation {
	Scanner sc = new Scanner(System.in);
	Employee emp[] = new Employee[10];
	
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
		
		Employee e1 = new Employee();
		e1.setId(id);
		e1.setName(name);
		e1.setSalary(salary);
		e1.setDept(dept);
		e1.setEmail(email);
		
		emp[i] =e1;
	}
	}
	 public void display()
 	{
 		System.out.println(Arrays.toString(emp));
 	}
    public void search()
 	{
 		System.out.println("Enter id : ");
 		int id = sc.nextInt();
 		for(int i = 0;i< emp.length;i++)
 	    {
 			if(emp[i] != null)
 			{
 				if(id == emp[i].getId())
 				{
 					System.out.println((emp[i]));
 				}
 			}
 	    }
 	}
}
