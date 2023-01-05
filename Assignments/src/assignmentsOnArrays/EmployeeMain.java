package assignmentsOnArrays;

import java.util.Scanner;

public class EmployeeMain {
	
	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
		Employee e[] = new Employee[4];
		
		{
			for(int i = 0;i< e.length;i++)
			{
				System.out.println("Enter id,name,Salary ");
				int id = sc.nextInt();
				String name = sc.next();
				int sal = sc.nextInt();
				
				
				Employee e1 = new Employee();
				
				e1.setId(id);
				e1.setSalary(sal);
				e1.setName(name);
				
				e[i] = e1;
			}
		}
		
		for(int i = 0;i< e.length;i++)
		{
			for(int j = i + 1;j < e.length;j++)
			{
			    if(e[i].getSalary() == (e[j].getSalary()))
			    {
			    	System.out.println(e[i]+" "+e[j]);
			    }
				/*
				 * else { break; }
				 */
			}
		}
		/*
		 * for(Employee e2 : e) { if(e2.getSalary().equals(e2)) {
		 * System.out.println(e2); } }
		 */
		
	}

}
