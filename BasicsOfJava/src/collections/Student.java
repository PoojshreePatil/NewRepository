package collections;

public class Student {

	int id;
	String name;
	
	public Student(int id, String name) {
		
		this.id = id;
		this.name = name;
	}
	
	
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

	public static void main(String[] args) {
		
		Student s = new Student(101,"poojshree");
		System.out.println(s);
		
	}
}
