package map;

import java.util.ArrayList;
import java.util.HashMap;

public class EmployeeAddressMain 
  {
	void setData(ArrayList<Employee1> emp)
		{
			emp.add(new Employee1(1,"kinjal","HR",70000,new Address("Pune","Maharashtra")));
			emp.add(new Employee1(56,"kartik","Sales",65000,new Address("Mumbai","Maharashtra")));
			emp.add(new Employee1(498,"Naresh","HR",65000,new Address("Banglore","Karnataka")));
			emp.add(new Employee1(45,"Raman","Marketing",70000,new Address("Pune","Maharashtra")));
			emp.add(new Employee1(34,"Meeta","HR",60000,new Address("Banglore","Karnataka")));
			emp.add(new Employee1(15,"Naira","Sales",50000,new Address("Cochin","Keral")));
			emp.add(new Employee1(563,"kiyara","Marketing",50000,new Address("Cochin","Keral")));
			emp.add(new Employee1(49,"Ishita","Development",80000,new Address("Mumbai","Maharashtra")));
			emp.add(new Employee1(457,"Riya","Marketing",65000,new Address("patna","Bihar")));
			emp.add(new Employee1(34,"priyanka","Development",55000,new Address("patna","Bihar")));
			emp.add(new Employee1(40,"Neeta","HR",60000,new Address("patna","Bihar")));
			emp.add(new Employee1(789,"Meenal","Development",60000,new Address("Bhopal","Madhya Pradesh")));
			emp.add(new Employee1(150,"Rahul","Sales",80000,new Address("Pune","Maharashtra")));
			emp.add(new Employee1(323,"Ramesh","Marketing",80000,new Address("Cochin","Keral")));
			emp.add(new Employee1(6,"Meeta","Finance",60000,new Address("Jaipur","Rajsthan")));
		}
		
		void createMap(ArrayList<Employee1> ae,HashMap<String,Integer> hm)
		{
			for(Employee1 e:ae)
			{
				String address=e.a.city;
				if(hm.containsKey(address))
				{
					int i=hm.get(address);
					hm.put(address, i+1);
				}
				else
				{
					hm.put(address, 1);
				}
				
				
			}
		}
		void createMap2(ArrayList<Employee1> ae ,HashMap<Integer,Integer> hm3)
		{
			for(Employee1 e : ae)
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
	public static void main(String[] args)
	{
		EmployeeAddressMain em=new EmployeeAddressMain();
		ArrayList<Employee1> ae=new ArrayList<>();
		em.setData(ae);
		System.out.println(ae);
		
		HashMap<String,Integer> hm=new HashMap<>();
		em.createMap(ae, hm);
		System.out.println(hm);
		HashMap<Integer,Integer> hm1=new HashMap<>();
		em.createMap2(ae, hm1);
		System.out.println(hm1);
		
		
	}
}

