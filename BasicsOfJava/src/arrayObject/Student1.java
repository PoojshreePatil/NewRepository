package arrayObject;

public class Student1 {

	private	int id,marks;
	private	String name, dept;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String toString()
	{
		return "Id: " +id+"\nName: "+name+"\nDepartment: "+dept+"\nMarks: "+marks;
	}
}
