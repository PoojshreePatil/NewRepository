package constructor;

import java.util.Scanner;

public class Constructoremp1 {

	int id,salary;
	String name,dept;
	
	Constructoremp1(int i,String n,int s,String d)
	{
	
		id = i;
		name = n;
		salary = s;
		dept = d;
	}
	void display()
	{
		System.out.println(id +" "+name +" "+salary+" "+dept+" ");
	}
	
	public String toString()
	{
		return id +"\n "+name +"\n "+salary+"\n"+dept+"\n ";
	}
	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		 
		System.out.println("Enter the id ,name, salary,dept:");
		int id = sc.nextInt();
		String name = sc.next();
		int salary = sc.nextInt();
		String dept = sc.next();
		
		Constructoremp1 e = new Constructoremp1(id,name,salary,dept);
		//e.display();
		System.out.println(e);
		
		Constructoremp1 e1 = new Constructoremp1(id,name,salary,dept);
		System.out.println(e1);
		
	}

}
