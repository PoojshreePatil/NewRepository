package arrayObject;

public class Department {

	int id,empno;
	String name;
	public Department(int id, int empno, String name) {
		
		this.id = id;
		this.empno = empno;
		this.name = name;
	}
	
	public String toString()
	{
		return "\nId: " +id+"  Name: "+name+"  Employee No: "+empno;
	}
	
}
