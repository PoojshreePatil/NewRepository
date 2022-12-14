package classesandobject;

import java.util.Scanner;

public class EmployeeDetails2 {

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
		
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Employee Id:");
		int eid = sc.nextInt();
		System.out.println("Enter the Employee Name:");
		String ename = sc.next();
		System.out.println("Enter the Employee Department:");
		String edepart = sc.next();
		System.out.println("Enter the Employee Salary:");
		int esal = sc.nextInt();
		System.out.println("Enter the Employee contact:");
		long econtact = sc.nextLong();
		System.out.println("Enter the Employee Email Id:");
		String eemail = sc.next();
		e1.getData(eid, ename, edepart, esal, econtact, eemail);

		System.out.println("Enter the Employee Id:");
		eid = sc.nextInt();
		System.out.println("Enter the Employee Name:");
		ename = sc.next();
		System.out.println("Enter the Employee Department:");
		edepart = sc.next();
		System.out.println("Enter the Employee Salary:");
		esal = sc.nextInt();
		System.out.println("Enter the Employee contact:");
		econtact = sc.nextLong();
		System.out.println("Enter the Employee Email Id:");
		eemail = sc.next();
		e2.getData(eid, ename, edepart, esal, econtact, eemail);

		System.out.println("Enter the Employee Id:");
		eid = sc.nextInt();
		System.out.println("Enter the Employee Name:");
		ename = sc.next();
		System.out.println("Enter the Employee Department:");
		edepart = sc.next();
		System.out.println("Enter the Employee Salary:");
		esal = sc.nextInt();
		System.out.println("Enter the Employee contact:");
		econtact = sc.nextLong();
		System.out.println("Enter the Employee Email Id:");
		eemail = sc.next();
		e3.getData(eid, ename, edepart, esal, econtact, eemail);

		System.out.println("Enter the Employee Id:");
		eid = sc.nextInt();
		System.out.println("Enter the Employee Name:");
		ename = sc.next();
		System.out.println("Enter the Employee Department:");
		edepart = sc.next();
		System.out.println("Enter the Employee Salary:");
		esal = sc.nextInt();
		System.out.println("Enter the Employee contact:");
		econtact = sc.nextLong();
		System.out.println("Enter the Employee Email Id:");
		eemail = sc.next();
		e4.getData(eid, ename, edepart, esal, econtact, eemail);

		System.out.println("Enter the Employee Id:");
		eid = sc.nextInt();
		System.out.println("Enter the Employee Name:");
		ename = sc.next();
		System.out.println("Enter the Employee Department:");
		edepart = sc.next();
		System.out.println("Enter the Employee Salary:");
		esal = sc.nextInt();
		System.out.println("Enter the Employee contact:");
		econtact = sc.nextLong();
		System.out.println("Enter the Employee Email Id:");
		eemail = sc.next();
		e5.getData(eid, ename, edepart, esal, econtact, eemail);

		e1.display();
		e2.display();
		e3.display();
		e4.display();
		e5.display();
	
	

	}

}
