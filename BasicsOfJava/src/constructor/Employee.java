package constructor;

import java.util.Scanner;

public class Employee {

	int id,basicsalary;
	String name;
	float hra,da,gs;
	Employee()
	{
		id =1;
		basicsalary = 40000;
		name = "Shree";
		
	}
	Employee(int i,int bs,String n)
	{
		id = i;
		basicsalary = bs;
		name = n;
		hra = (basicsalary*0.35f);
		da = (basicsalary*0.20f);
		gs = (basicsalary +hra +da);
	}
	
	void show()
	{
		System.out.println(id+" "+basicsalary+" "+name+" "+hra+" "+da+" "+gs+"" );
	}
	public  String toString()
	{
		return id+" "+basicsalary+" "+name+" "+hra+" "+da+" "+gs+"" ;
	}
	public static void main(String[] args) {

		Employee e = new Employee();
		//e.show();
		System.out.println(e);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the id , Basic salary , name:");
		int id = sc.nextInt();
		int basicsalary = sc.nextInt();
		String name = sc.next();
		
		Employee e1 = new Employee(id,basicsalary,name);
		//e1.show();
		System.out.println(e1);

	}

}
