package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class StudentMapExample 
{
     Scanner sc = new Scanner(System.in);
	void SetData(HashMap<Integer, Student> st)
	{
		for(int i = 0;i<3;i++)
		{
			System.out.println("Enter Student's id,name,email,marks: ");
			int id = sc.nextInt();
			String name = sc.next();
			String email = sc.next();
			int marks = sc.nextInt();
			
			Student s = new Student(name,email,marks);
			
			st.put(id, s);
		}
	}
	void display(HashMap<Integer, Student> st)
	{
		for(Map.Entry<Integer , Student> en :st.entrySet())
		{
			if(en.getValue().name.startsWith("P"))
			  System.out.println(en.getKey()+" "+en.getValue()+" ");
		}
	}
	
	public static void main(String[] args) {
		
		HashMap<Integer, Student> std = new HashMap<>();
		StudentMapExample sm = new StudentMapExample();
		sm.SetData(std);
		sm.display(std);
	}
}
