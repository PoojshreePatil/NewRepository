package arrayObject;

import java.util.Scanner;

public class StudentExample1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Student1 stud[] = new Student1[2];
		
		
		 for(int i= 0;i< 2;i++)
		 {
			 System.out.println("Enter Id,Name,Department,Marks:");
			 int id = sc.nextInt();
			 String name =sc.next();
			 String dept = sc.next();
			 int marks = sc.nextInt();
			 
			Student1 s = new Student1();
			s.setId(1);
			s.setName(name);
			s.setDept(dept);
			s.setMarks(marks);
			 
			 
			 stud[i] = s;
		 }
		 
		 for(Student1 s : stud)
		 {
			 System.out.println(s);
		 }
	}

}
