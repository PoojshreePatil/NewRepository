package comparable;

public class Employee implements Comparable<Employee> {

	int id,age;
	String name,designation;
	public Employee(int id, int age, String name, String designation) {
	
		this.id = id;
		this.age = age;
		this.name = name;
		this.designation = designation;
	}
	@Override
	public String toString() {
		return "\n Employee id=" + id + ", age=" + age + ", name=" + name + ", designation=" + designation;
	}
	
	public int compareTo(Employee e)
	{
		if(e.id < e.id)
      	  return 1;
		else if(e.id > e.id)
      	  return -1;
		else
		  return 0;
	}
	
	
}
