package comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeMain {

	public static void main(String[] args) {

		ArrayList<Employee> ae = new ArrayList();
		
		ae.add(new Employee(101,28,"CEO","Miss.Patil"));
		ae.add(new Employee(71,20,"Manager","Yashraj"));
		ae.add(new Employee(1,20,"MD","Poojshree"));
		ae.add(new Employee(87,22,"HR","Snehal"));
		ae.add(new Employee(44,22,"Assistant Manager","Shree"));
		
		System.out.println(ae);
		Collections.sort(ae);
		System.out.println(ae);
		/*
		for(Employee e : ae)
		{
		   Collections.sort((List<T>) e);
		   System.out.println();
		}
		*/
	}

}
