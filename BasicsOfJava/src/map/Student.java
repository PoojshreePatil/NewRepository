package map;

public class Student 
 {
	String name,emailId;
	int marks;
	
	public Student(String name, String emailId, int marks) {
	
		this.name = name;
		this.emailId = emailId;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student name=" + name + ", emailId=" + emailId + ", marks=" + marks;
	}
	
    
 }
