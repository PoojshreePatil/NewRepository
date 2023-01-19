package cloneble;

import java.util.ArrayList;

public class Student implements Cloneable
    {

	String name;
	ArrayList<Integer> marks;
	public Student(String name, ArrayList<Integer> marks) {
		
		this.name = name;
		this.marks = marks;
	}

	public String toString() {
		return "Student [name=" + name + ", marks=" + marks + "]";
	}
	
	public Object clone() throws CloneNotSupportedException
	{
		Student s = (Student) super.clone();
		s.marks= (ArrayList<Integer>) marks.clone();
		return s;
	//	return super.clone();//by using clone() get Shallow Copy 
		
	}
}
