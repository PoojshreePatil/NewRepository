package arrayObject;

import java.util.Arrays;

public class Company {

	int id;
	String name;
	Department dept[];
	
	public Company(int id, String name, Department[] dept)
	{
	
		this.id = id;
		this.name = name;
		this.dept = dept;
	}
	
	public String toString()
	{
		return "Id: " +id+"\nName: "+name+"\nDepartment Info: "+Arrays.toString(dept);
	}
	
}
