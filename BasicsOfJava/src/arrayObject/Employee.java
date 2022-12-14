package arrayObject;

public class Employee {

	 int id,salary;
	String name,dept;
	public Employee(int id,  String name, String dept,int salary) {
		
		this.id = id;
		this.salary = salary;
		this.name = name;
		this.dept = dept;
	}

	public String toString()
	{
		return "Id: " +id+"\nName: "+name+"\nDepartment: "+dept+"\nSalary: "+salary;
	}
	
	void salaryHike()
	{
		
	}
	
}
