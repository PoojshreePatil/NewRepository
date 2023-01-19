package Comparable;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeMain {

	void elements(ArrayList<Employee> emp1)
	{
		emp1.add(new Employee(1,"Raj",90000,"Testing",'A'));
		emp1.add(new Employee(100,"Yash",58000,"Hr",'B'));
		emp1.add(new Employee(61,"YashRaj",96000,"Developer",'C'));
		emp1.add(new Employee(42,"Poojshree",99000,"Developer",'A'));
		emp1.add(new Employee(59,"pooja",76000,"Fianance",'B'));
		emp1.add(new Employee(62,"shree",45700,"Hr",'C'));
		emp1.add(new Employee(39,"Snehal",65000,"Fianance",'D'));

	}
	
	public static void main(String[] args) {

		ArrayList<Employee> emp = new ArrayList();
		
		EmployeeMain em = new EmployeeMain();
		em.elements(emp);
		System.out.println(emp);
		//Collections.sort(emp);
		
		
		System.out.println(".....Sorting Using Comparator Based on Name.....");
		Collections.sort(emp, new EmployeeNameSort());
		System.out.println(emp);
		
		System.out.println(".....Sorting Using Comparator Based on id.....");
		Collections.sort(emp, new EmployeeIdSort());
		System.out.println(emp);
		
		System.out.println(".....Sorting Using Comparator Based on Ratings.....");
		Collections.sort(emp, new EmployeeRatingSort());
		System.out.println(emp);
	}

}
