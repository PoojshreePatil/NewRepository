package array2d;

import java.util.Scanner;

public class EmployeeMain {
     Scanner sc = new Scanner(System.in);
	
      Employee1 e[] = new Employee1[3];
      Employee1 e1 = new Employee1();
      void insertdata()
      {
       for(int i = 0;i< e.length;i++)
       {
    	
    	 
    	  System.out.println("Enter data  id ,Name ,Salary ,Department:");
    	   int eid = sc.nextInt();
    	   String ename = sc.next();
    	   int esalary = sc.nextInt();
    	   String edept = sc.next();
    	   
  	    	e1.setId(eid);
  		    e1.setName(ename);
  		    e1.setSalary(esalary);
  		    e1.setDept(edept);
  		    e[i]=e1;
      } 
      
      }
      void viewData()
      {
    	  for(int i = 0;i< e.length;i++)
          {
    		  System.out.println();
    	  System.out.println("Employee Id,Name ,Salary,department is:");
    	  System.out.println("Id:"+e1.getId()+"Name:"+e1.getName()+"Salary:"+e1.getSalary()+"Department:"+e1.getDept());
          } 
      }
      void specificviewdata(int id)
      {
    	  for(Employee1 e2 : e)
          {
    	     if(id == e1.getId())
    	      {
    	    	 System.out.println("Id:"+e1.getId()+"Name:"+e1.getName()+"Salary:"+e1.getSalary()+"Department:"+e1.getDept());
    	       }
          }
      }
      void update(int id)
      {
    	  for(Employee1 e2 : e)
          {
    		
    	     if(id == e1.getId())
    	       {
    	    	 int bonus = e1.getSalary()* (15 / 100);
    	    	 int  newSal = e1.getSalary() + bonus;
    	    	  e1.setSalary(newSal);
    	    	 System.out.println("Id:"+e1.getId()+"Name:"+e1.getName()+"Salary:"+e1.getSalary()+"Department:"+e1.getDept());
    	       }
          } 
      }
    	  void delete(int id)
    	  {
    		  for(Employee1 e2 : e)
              {
        	     if(id != e1.getId())
        	      {
        	    	 System.out.println("Id:"+e1.getId()+"Name:"+e1.getName()+"Salary:"+e1.getSalary()+"Department:"+e1.getDept());
        	       }
              } 
    	  }
      
	public static void main(String[] args) {

		EmployeeMain e3 = new EmployeeMain();
		
		e3.insertdata();
		e3.viewData();
		//e3.specificviewdata(1);
		//e3.update(2);
		//e3.delete(4);
		
		
		
	}

}
