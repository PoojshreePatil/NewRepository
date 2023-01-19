package comparator;

public class Faculty {

	int id,salary;
	String name,subject,dept;
	
	public Faculty(int id, int salary, String name, String subject, String dept) {
		
		this.id = id;
		this.salary = salary;
		this.name = name;
		this.subject = subject;
		this.dept = dept;
	}

	public String toString() {
		return "\nFaculty id:" + id + ", salary:" + salary + ", name:" + name + ", subject:" + subject + ", dept:" + dept;
	}
	
	
}
