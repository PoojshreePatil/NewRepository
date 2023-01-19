package ComparatorHashMap;

public class Student {

	int rollno,age;
	String name;
	public Student(int rollno, int age, String name) {
	
		this.rollno = rollno;
		this.age = age;
		this.name = name;
	}
	@Override
	public String toString() {
		return " \nStudent rollno=" + rollno + ", age=" + age + ", name=" + name ;
	}
	
	
}
