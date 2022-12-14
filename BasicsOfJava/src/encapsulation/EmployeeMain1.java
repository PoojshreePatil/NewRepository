package encapsulation;

import java.util.Scanner;

public class EmployeeMain1 {

	public static void main(String[] args) {

	
		Scanner sc = new Scanner(System.in);
		   
		
	    System.out.println("Enter the id,name,salary,dept,contact:");
	    int id = sc.nextInt();
	    String name = sc.next();
	    int salary = sc.nextInt();
	    String dept = sc.next();
	    String contact = sc.next();
	    
		Employee e = new Employee();
		e.setId(id);
		e.setName(name);
		e.setSalary(salary);
		e.setDept(dept);
		e.setContact(contact);
		
		
		
		System.out.println("Enter the id,name,salary,dept,contact:");
	    id = sc.nextInt();
	    name = sc.next();
	    salary = sc.nextInt();
	    dept = sc.next();
	    contact = sc.next();
	    
		Employee e1 = new Employee();
		e1.setId(id);
		e1.setName(name);
		e1.setSalary(salary);
		e1.setDept(dept);
		e1.setContact(contact);
		
		
		System.out.println("Enter the id,name,salary,dept,contact:");
	    id = sc.nextInt();
	    name = sc.next();
	    salary = sc.nextInt();
	    dept = sc.next();
	    contact = sc.next();
	    
		Employee e2 = new Employee();
		e2.setId(id);
		e2.setName(name);
		e2.setSalary(salary);
		e2.setDept(dept);
		e2.setContact(contact);
		
		
		System.out.println(e.getId()+" "+e.getName()+" "+e.getSalary()+" "+e.getDept()+" "+e.getContact()+" ");
		System.out.println(e1.getId()+" "+e1.getName()+" "+e1.getSalary()+" "+e1.getDept()+" "+e1.getContact()+" ");
		System.out.println(e2.getId()+" "+e2.getName()+" "+e2.getSalary()+" "+e2.getDept()+" "+e2.getContact()+" ");
	
	
	
	}

}
