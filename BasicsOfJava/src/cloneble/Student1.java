package cloneble;

public class Student1 implements Cloneable{

	int id;
	String name;
	Department d;
	@Override
	public String toString() {
		return "Student1 [id=" + id + ", name=" + name + ", d=" + d + "]";
	}
	public Student1(int id, String name, Department d) {
		super();
		this.id = id;
		this.name = name;
		this.d = d;
	}
	
	public Object clone() throws CloneNotSupportedException
	{
		Student1 s = (Student1) super.clone();
		s.d= (Department) d.clone();
		return s;
	}
}

