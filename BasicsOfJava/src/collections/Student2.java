package collections;

import java.util.ArrayList;
import java.util.Scanner;

public class Student2 {

	int id;
	String name,dept;
	ArrayList<Integer> marks;
	
	public void setMarks(ArrayList<Integer> marks) {
		this.marks = marks;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	
	
//	Integer marks;
	
	@Override
	public String toString() {
		return "Student2 [id=" + id + ", name=" + name + ", dept=" + dept + ", marks=" + marks +"]";
	}

	
	
}
