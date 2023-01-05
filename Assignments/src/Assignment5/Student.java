package Assignment5;


/*10.Create class Student (id, name) then create 2 objects of Student using new 
keyword. Print 2 objects and see its hashcode is different E.g.
tudent@15db9742 and Student@2329742. If you do this Student s1 = new 
Student (); Student s2 = s1; Now print s1 and s2 see both reference 
variables are pointing to same location now override the toString () method 
in student class and see the beautiful output.*/

public class Student {

	int id;
	String name;
	public Student(int id, String name) {
	
		this.id = id;
		this.name = name;
	}
	
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}


	public static void main(String[] args) {
		
		Student s1 = new Student(1, "Raj");
		//Student s2 = new Student(2, "Yash");
		Student s2 = s1;
		//s1 = s2;
		System.out.println(s1);
		System.out.println(s2);
	}
}
