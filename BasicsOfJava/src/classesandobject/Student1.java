package classesandobject;

import java.util.Scanner;

public class Student1 {

		int id;
		String name;
		int marks;
		String dept;

		void setData(int i, String n, int m, String d) 
		{
			id = i;
			name = n;
			marks = m;
			dept = d;
		}

		void display() {
			System.out.println(id + " " + name + " " + marks + " " + dept);
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter  id :");
			int sid = sc.nextInt();
			System.out.println("Enter Name :");
			String sname = sc.next();
			System.out.println("Enter marks :");
			int smarks = sc.nextInt();
			System.out.println("Enter dept :");
			String sdept = sc.next();
			
			Student1 s1 = new Student1();
			s1.setData(sid,sname,smarks,sdept); 
			
			System.out.println("Enter  id :");
			sid = sc.nextInt();
			System.out.println("Enter Name :");
			sname = sc.next();
			System.out.println("Enter marks :");
			smarks = sc.nextInt();
			System.out.println("Enter dept :");
			sdept = sc.next();
			
			
			Student1 s2 = new Student1();
			s2.setData(sid,sname,smarks,sdept);
			
			System.out.println("Enter  id :");
			sid = sc.nextInt();
			System.out.println("Enter Name :");
			sname = sc.next();
			System.out.println("Enter marks :");
			smarks = sc.nextInt();
			System.out.println("Enter dept :");
			sdept = sc.next();
			
			
			Student1 s3 = new Student1();
			s3.setData(sid,sname,smarks,sdept);
			

			System.out.println("Enter  id :");
			sid = sc.nextInt();
			System.out.println("Enter Name :");
			sname = sc.next();
			System.out.println("Enter marks :");
			smarks = sc.nextInt();
			System.out.println("Enter dept :");
			sdept = sc.next();
			
			Student1 s4 = new Student1();
			s4.setData(sid, sname, smarks, sdept);

			s1.display();
			s2.display();
			s3.display();
			s4.display();
		
	}
	}


