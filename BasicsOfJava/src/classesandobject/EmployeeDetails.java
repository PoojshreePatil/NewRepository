package classesandobject;

import java.util.Scanner;

public class EmployeeDetails {

	int id,salary;
	long contact;
	String name,depart,email;
	void getData(int i,String n,String d,int s,long c,String e)
	{
		id = i;
		name = n;
		depart = d;
		salary = s;
		contact = c;
		email = e;
	}
	
	void display()
	{
		System.out.println(id+" "+name+" "+depart+" "+salary+" "+contact+" "+email+" ");
	}
	
	public static void main(String[] args) {

		EmployeeDetails e1 = new EmployeeDetails();
		EmployeeDetails e2 = new EmployeeDetails(); 
		EmployeeDetails e3 = new EmployeeDetails(); 
		EmployeeDetails e4 = new EmployeeDetails(); 
		EmployeeDetails e5 = new EmployeeDetails(); 
		
		e1.getData(1, "Poojshree ", "Computer   ", 50000,   9876543210l, "  poojshreepatil1@gmail.com");
		e2.getData(2, "Snehal ", "   Phisycs    ", 40000, 9836543211l, "  snehalpatil1@gmail.com");
		e3.getData(3, "YashRaj ", "  Mechanical ", 60000,  9126543217l, "  yashrajpatil1@gmail.com");
		e4.getData(4, "Snahal ", "   Civil      ", 50000,  9070543215l, "  snehalpatil2@gmail.com");
		e5.getData(5, "Shivaji ", "  Education  ", 150000,  9623538367l, " shivajipatil@gmail.com");
		
 
		    e1.display();
			e2.display();
			e3.display();
			e4.display();
			e5.display();
	}
	}
