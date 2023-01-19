package cloneble;

public class Student1DeptCloneMain {

	public static void main(String[] args) {

		Department d= new Department("Computer");
		
		Student1 s1 = new Student1(101,"Poojshree",d);
		
		Student1 s2 = s1;
		System.out.println(s1);
		s2.name ="Shree";
		s2.d.name ="Computer Science";
		System.out.println(s2);
	}

}
