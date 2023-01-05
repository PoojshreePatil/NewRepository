package arrayObject;

import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Employee e[]= new Employee[3];
		
		
		for(int i = 0;i< e.length;i++)
		{
			System.out.println("Enter id.name,salary:");
			int eid = sc.nextInt();
			String enm = sc.next();
			int esal = sc.nextInt();
			
		
			System.out.println("ENter day,month,year");
				int day1=sc.nextInt();
				int mnth = sc.nextInt();
				int yr = sc.nextInt();
				
				
			  System.out.println("Enter did ,Dname: ");	  
			  int did = sc.nextInt();
			  String dname = sc.next();
			  
				Date d1 = new Date();
				d1.setDay(day1);
				d1.setMonth(mnth);
				d1.setYear(yr);
				
				Department dept1 = new Department();
				dept1.setDid(did);
				dept1.setDname(dname);
				
				Employee e1 = new Employee();
				e1.setId(eid);
				e1.setName(enm);
				e1.setSalary(esal);
				e1.setD(d1);
				e1.setDept(dept1);
			
				e[i] = e1;
     	}
	
		
		for(int i = 0;i< e.length;i++)
		{
			for(int j = i+ 1;j< e.length-1;j++)
			{
			/*if(e[i].getD().equals(e[j].getD()))
			{
				   System.out.println(e[i] + "\n"+e[j]);
			}*/
		    if((e[i].getDept().getDname()).equals(e[j].getDept().getDname()))
			{
				 System.out.println(e[i] + "\n"+e[j]);
			}
			/*
			 * else { break; }
			 */
		}
			
			
	}

	}
}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

/*	for(Employee e2: e)
	{
		if(e2.getD().equals(e2))
		{
			System.out.println(e2);
		}
	
	*/
	
	
	
	
	
	
/*
 * Employee e1 = new Employee(eid,enm,esal,d1); e[i] = e1; } String s =
 * e[0].getD().toString(); String s1 = null; for(int i = 0;i< e.length;i++) {
 * s1=e[i].toString(); if(s.equalsIgnoreCase(s1)) { System.out.println(e[i]); }
 * }
 */