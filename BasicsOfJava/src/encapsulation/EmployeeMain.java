package encapsulation;

import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {
    
	for(int i = 1;i<=5;i++)
    {
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
		
		System.out.println(e.getId()+" "+e.getName()+" "+e.getSalary()+" "+e.getDept()+" "+e.getContact()+" ");
	}
	}
}
