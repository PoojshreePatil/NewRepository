package array2d;

import java.util.Scanner;
import arrayObject.Employee;
public class EmployeeMain1 {

	
		Scanner sc = new Scanner(System.in);
		Employee e[] = new Employee[5];
		
		Employee1 e1 = new Employee1();
		void insertdata()
		{
		for(int i = 0;i< 5 ;i++)
		{
			
			  System.out.println("Enter id ,Name ,Salary ,Department:");
			  int eid = sc.nextInt();
			  String ename = sc.next();
			  int esalary =sc.nextInt();
			  String edept = sc.next();
			  
			    e1.;
	  		    e1.setName(ename);
	  		    e1.setSalary(esalary);
	  		    e1.setDept(edept);
		   
		   
		        e[i] = e1;
		}
		
		
		  public static void main(String[] args) {
			  
			  EmployeeMain1 em = new EmployeeMain1();
		   em.insertdata( );
		   em.viewData();
		   em.viewSpecificData();
		   em.updataData();
		   em.deleteData();
	}

}

		/*void insertdata(int id, String name,int salary,String dept)
		{
			
			System.out.println("Enter id ,Name ,Salary ,Department:");	
		     id = sc.nextInt();
		    name = sc.next();
		    salary =sc.nextInt();
		    dept = sc.next();
		    
		}*/