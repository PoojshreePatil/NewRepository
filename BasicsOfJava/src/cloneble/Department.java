package cloneble;

public class Department implements Cloneable {

	String name;

	public Department(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Department [name=" + name + "]";
	}
	
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
}
