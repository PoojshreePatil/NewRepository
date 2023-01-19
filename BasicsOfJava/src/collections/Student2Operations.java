package collections;

import java.util.ArrayList;
import java.util.Scanner;

public class Student2Operations {
	
	void setArrayList(ArrayList<Student2> s)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of Sudents:");
	    int size = sc.nextInt();
		for(int i = 0;i<size;i++)
		{
			System.out.println("Enter id,name,department:");
			int id = sc.nextInt();
		    String name = sc.next();
		    String dept = sc.next();
		    Student2 s1 = new Student2();    
		    
			System.out.println("Enter 5 subject marks:");
			int m1 = sc.nextInt();
			int m2 = sc.nextInt();
			int m3 = sc.nextInt();
			int m4 = sc.nextInt();
			int m5 = sc.nextInt();
			
			 ArrayList<Integer> marks = new ArrayList(5);
			marks.add(m1);
			marks.add(m2);
			marks.add(m3);
			marks.add(m4);
			marks.add(m5);
		    
		    s1.setId(id);
		    s1.setName(name);
		    s1.setDept(dept);
		    s1.setMarks(marks);
		    s.add(s1);
		}  
		
	}
	void percentage(ArrayList<Student2> s)
	{   
		for(Student2 st : s)
		{
		    int sum = 0;
		   for(Integer i : st.marks)
		   {
			  sum = sum + st.marks.get(i);
		   }
		
		float percent = sum / st.marks.size();
		char ch = grade(percent);
		System.out.println(st.getName()+" "+st.getDept()+" "+percent+" "+ch+" ");
		}
	}
	
	char grade(float per)
	{
		 if(per > 60)
			{
	    	   return 'A';
			}
		    else if(per > 50)
			{
		    	return 'B';
			}
			else if(per > 35)
			{
				return 'C';
			}
			else
			{
				return 'F';
			}	
	}
	}
	/*
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Student2> s = new ArrayList(2);
	
	    System.out.println("Enter the no of Sudents:");
	    int size = sc.nextInt();
		for(int i = 0;i<size;i++)
		{
			System.out.println("Enter id,name,department:");
			int id = sc.nextInt();
		    String name = sc.next();
		    String dept = sc.next();
		    Student2 s1 = new Student2();    
		    
			System.out.println("Enter 5 subject marks:");
			int m1 = sc.nextInt();
			int m2 = sc.nextInt();
			int m3 = sc.nextInt();
			int m4 = sc.nextInt();
			int m5 = sc.nextInt();
			
			 ArrayList<Integer> marks = new ArrayList(5);
			marks.add(m1);
			marks.add(m2);
			marks.add(m3);
			marks.add(m4);
			marks.add(m5);
		    
		    s1.setId(id);
		    s1.setName(name);
		    s1.setDept(dept);
		    s1.setMarks(marks);
		    s.add(s1);
		    
		}*/
		/*
		for(Student2 st : s)
		{
			if(st.dept.equalsIgnoreCase("ENtc"))
			{
			int sum = 0;
			for(Integer i : st.marks)
			{
				sum = sum + i; 
			}
			float percent = sum / st.marks.size();
			char grade;
			{
				
		       if(percent > 60)
				{
		    	   grade ='A';
				}
			    else if(percent > 50)
				{
			    	grade ='B';
				}
				else if(percent > 35)
				{
					grade ='C';
				}
				else
				{
					grade ='F';
				}
			}
			System.out.println(st.getName()+" "+st.getDept()+" "+percent+" "+grade+" ");
			}
		}
		*/
	
	//}
	
//}
