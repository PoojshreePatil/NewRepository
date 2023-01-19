package map;

public class Employee1
   {

	int id;
	String name,dept;
	int salary;
	Address a;

	Employee1(){}

	Employee1(int id,String name,String dept,int salary,Address a)
	{
		this.id=id;
		this.name=name;
		this.dept=dept;
		this.salary=salary;
		this.a=a;
	}
	public String toString()
	{
		return "\n"+id+" "+name+" "+dept+" "+salary+" "+a;			
	}
}
