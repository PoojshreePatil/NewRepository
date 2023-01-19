package map;

public class Employee {

	int id;
	String name,dept;
	int salary;
	public Employee(int id, String name, String dept, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "\nEmployee id=" + id + ", name=" + name + ", dept=" + dept + ", salary=" + salary;
	}
	
	
}
