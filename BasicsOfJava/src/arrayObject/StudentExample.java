package arrayObject;

import java.util.Scanner;

public class StudentExample {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Student stud[] = new Student[2];
		
		//Student s1 = new Student(1,"Raj","Computer",90);
		// stud[0] = s1;
		/*
		 * stud[0] = new Student(1,"Raj","Computer",90); stud[1] = new
		 * Student(2,"Yash","Electronic",92); stud[2] = new
		 * Student(3,"YashRaj","Mechanical",88); stud[3] = new
		 * Student(4,"Poojshree","Computer",90); stud[4] = new
		 * Student(5,"Snehal","Civil",90);
		 */
	//	System.out.println(s1);
		 
		 for(int i= 0;i< 2;i++)
		 {
			 System.out.println("Enter Id,Name,Department,Marks:");
			 int id = sc.nextInt();
			 String name =sc.next();
			 String dept = sc.next();
			 int marks = sc.nextInt();
			 
			 stud[i] = new Student(id,name,dept,marks);
		 }
	/*
	 * for(Student s: stud ) { System.out.println(s); }
	 */
		 for(Student s: stud )
		 {
			 if((s.marks == 90) || (s.dept.equals("Computer")))
			 {
			    System.out.println(s);
		     }
		 }

	
}
}
