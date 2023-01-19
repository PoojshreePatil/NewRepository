package ComparatorHashMap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeProfileMain  {

	void setElements(ArrayList<Employee> emp1)
	{
		emp1.add(new Employee(4,"Shree",new Profile("Maharashtra","India")));
		emp1.add(new Employee(10,"Yash",new Profile("Washington","USA")));
		emp1.add(new Employee(1,"Yash",new Profile("Paris","France")));
		emp1.add(new Employee(101,"Raj",new Profile("Brasilia","Brazil")));
	}
	public static void main(String[] args) {

		ArrayList<Employee> emp = new ArrayList();
		EmployeeProfileMain em = new EmployeeProfileMain();
		em.setElements(emp);
		Collections.sort(emp);
		for(Employee e : emp)
		{
          System.out.println(e);		
		}
	
		
		System.out.println("\n.......Sorting of  Employee Based on Country Name......\n");
		Collections.sort(emp, new EmployeeSortOnCountry());
		for(Employee e : emp)
		{
            System.out.println(e);		
		}	
	}

}
