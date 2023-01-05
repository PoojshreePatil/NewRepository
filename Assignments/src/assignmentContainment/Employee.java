package assignmentContainment;

public class Employee {

	int id,salary;
	String  name;
	Dept d;
	Mydate m;
	
	public void setD(Dept d)
	{
		this.d = d;
	}
	public Dept getD()
	{
		return d;
	}
	public void setM(Mydate m)
	{
		this.m = m;
	}
	public Mydate getM(Mydate m)
	{
		return m;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String toString()
	{
		return "Id:"+id+"\nSalary:"+salary+"\nName:"+name+"\nDept"+d+"\nMydate:"+m;
	}
}
