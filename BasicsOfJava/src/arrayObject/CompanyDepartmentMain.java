package arrayObject;

import java.util.Scanner;

public class CompanyDepartmentMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
	
		
		Company comp[] = new Company[2];
		
		for(int i = 0;i< comp.length;i++)
		{
			Department dept[] = new Department[2];
			System.out.println("Enter the Company id,name:");
			int cid = sc.nextInt();
			String cname = sc.next();
			
			for(int j = 0 ; j< dept.length;j++)
			{
				
				System.out.println("Enter the Department id,Name,Employeeno:");
				int did = sc.nextInt();
				String dname = sc.next();
				int dempno = sc.nextInt();
				
				dept[j] = new Department(did,dempno, dname);
			}
			
			comp[i] = new Company(cid,cname,dept);
			
		}
		
		for(Company c : comp)
		{
			System.out.println(c);
		}
	}

}
