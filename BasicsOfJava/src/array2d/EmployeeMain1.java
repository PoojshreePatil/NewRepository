package array2d;

import java.util.Scanner;
import arrayObject.Employee;
public class EmployeeMain1 {

	
		Scanner sc = new Scanner(System.in);
		Employee1 e[] = new Employee1[5];
		
		
		void insertdata()
		{
		for(int i = 0;i< 5 ;i++)
		{
			
			  System.out.println("Enter id ,Name ,Salary ,Department:");
			  int eid = sc.nextInt();
			  String ename = sc.next();
			  int esalary =sc.nextInt();
			  String edept = sc.next();
			  
			  Employee1 e2 = new Employee1();
			    e2.setId(eid);;
	  		    e2.setName(ename);
	  		    e2.setSalary(esalary);
	  		    e2.setDept(edept);
		   
		   
		        e[i] = e2;
		}
		
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