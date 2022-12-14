package constructor;

public class Employee1 {

	/*Create one class Employee (id , name, salary) with private access modifier 
	and create getter and setter.*/
	
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
	/*
	public static void main(String[] args) {

		
		 * Employee q = new Employee(); q.setId(1); q.setName("Poojshree");
		 * q.setSalary(60000);
		 * 
		 * System.out.println("Id: "+q.getId()+" Name: "+q.getName()+" Salary: "+q.
		 * getSalary());
		
	}
 */
}
