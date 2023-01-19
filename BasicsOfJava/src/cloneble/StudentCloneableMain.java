package cloneble;

import java.util.ArrayList;

public class StudentCloneableMain {

	public static void main(String[] args) throws CloneNotSupportedException {

		ArrayList<Integer> al = new ArrayList();
		
		al.add(90);
		al.add(88);
		al.add(92);
		al.add(89);
		al.add(91);
		
		//Student s1 = new Student("Poojshree", al);
		//System.out.println(s1);
		/*
		Student s2 = (Student) s1.clone();
		System.out.println(s1);
		System.out.println(s2);
		s2.marks.add(100);
				System.out.println("....After altering s2...");
		System.out.println(s1);  //shallow Copy
		System.out.println(s2);  //Shallow Copy    change in object reflects on both
		
		*/
		Student s3 = new Student("Pooja",al);
		Student s4 = (Student) s3.clone();
		System.out.println(s3);     
		System.out.println(s4);
		
		s4.marks.add(500);
		System.out.println("....After altering s4...");
		System.out.println(s3);    //object doesn't reflect 
		System.out.println(s4);   // deep copy
		
		
		
		
	}

}
