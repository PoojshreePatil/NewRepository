package map;

import java.util.ArrayList;
import java.util.HashMap;

public class EmployeeMapExample {

	void setElements(ArrayList<Employee> emp1)
	{
		emp1.add(new Employee(201,"Poojshree","Development",70000));
		emp1.add(new Employee(101,"Nivedita","Development",70000));
		emp1.add(new Employee(1,"Payal","Hr",65000));
		emp1.add(new Employee(10,"Anjali","Marketing",72000));
		emp1.add(new Employee(44,"Akshata","Testing",60000));
		emp1.add(new Employee(43,"Megha","Hr",65000));
		emp1.add(new Employee(41,"Tejashri","Testing",60000));
		emp1.add(new Employee(40,"Shruti","Finance",68000));
		emp1.add(new Employee(22,"Sharmila","Sales",70000));
		emp1.add(new Employee(35,"Pratibha","Finance",60000));
		emp1.add(new Employee(73,"Shraddha","Sales",65000));
	}
	void createMap(ArrayList<Employee> emp1 ,HashMap<String,Integer> hm1)
	{
		for(Employee e : emp1)
		{
			String dept = e.dept;
			if(hm1.containsKey(dept))
			{
			//	int i = hm1.get(dept);
				int j = hm1.getOrDefault(dept, 1);
				hm1.put(dept, j+1);
				
				//hm1.put(dept, hm1.get(dept)+ 1);
			}
			else
			{
				hm1.put(dept,1);
			}
		}
	}
	void createMap2(ArrayList<Employee> emp1 ,HashMap<Integer,Integer> hm3)
	{
		for(Employee e : emp1)
		{
			int salary = e.salary;
			if(hm3.containsKey(salary))
			{
				hm3.put(salary,hm3.get(salary)+1);
			}
			else
			{
				hm3.put(salary,1);
			}
		}
	}
	public static void main(String[] args) {
		
		ArrayList<Employee> emp = new ArrayList();
		HashMap<String,Integer> hm = new HashMap();
		HashMap<Integer,Integer> hm2 = new HashMap();
		EmployeeMapExample em = new EmployeeMapExample();
		em.setElements(emp);
		em.createMap(emp, hm);
		System.out.println(emp);
		System.out.println(hm);
		em.createMap2(emp, hm2);
		System.out.println(hm2);
		
	}

}
