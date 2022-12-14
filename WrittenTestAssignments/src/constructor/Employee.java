package constructor;

public class Employee {

	Employee()
	{
		System.out.println("This is Default Constructor");
	}
	Employee(int id,String name,int salary)
	{
		this.id = id;
		this.name = name;
		this.salary = salary;
		System.out.println("This is Parameterized Constructor");
	}
	
	void display()
	{
		System.out.println("Id:"+id+"  Name:"+ name+"  Salary:"+ salary);
	}
	private int id,salary;
	private String name;
	
	public void setId(int id)
	{
		this.id = id;
	}
	public int getId()
	{
		return id;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
	}
	
	public void setSalary(int salary)
	{
		this.salary = salary;
	}
	public int getSalary()
	{
		return salary;
	}
}
