package Comparable;

public class Employee 
//implements Comparable<Employee> 

{

	int id,salary;
	String name,dept;
	char rate;
	public Employee(int id, String name,int salary,String dept,char rate) {

		this.id = id;
		this.name = name;
		this.salary = salary;
		this.dept = dept;
		this.rate = rate;
	}
	@Override
	public String toString() {
		return " " +"Employee id=" + id + ", name:" + name+", salary=" + salary +", Department:"+dept+", Rate: "+rate ;
	}
	/*
	public int compareTo(Employee e)
	{
		/*
		 //if(this.id > e.id)
		 
		if(this.salary > e.salary)
			//return -1;
	    	return 1;
		//else if(this.id < e.id)
		if(this.salary < e.salary)
	    	return -1;
		    //return 1;
		else
			return 0;
		*/
		
		
		//if(this.dept.compareTo(e.dept) == 0)
		//{
			/*
			if(this.salary > e.salary)
				return 1;
			else if(this.salary < e.salary)
				return -1;
			else
				return 0;*/
			/*
			if(this.id > e.id)
				return 1;
			else if(this.id < e.id)
		    	return -1;
			else	
		    	return 0;
			
		}*/
	/*
		else
			return (this.dept.compareTo(e.dept));
		
	}
	*/
}
