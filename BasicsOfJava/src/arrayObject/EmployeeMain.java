package arrayObject;

import java.util.Arrays;

public class EmployeeMain {

	public static void main(String[] args) {

		Employee emp[] = new Employee[10];
	
		//Employee e = new Employee(id,name,dept,salary);
		
		emp[0] = new Employee(1,"Raj","Manager",80000);
		emp[1] = new Employee(2,"Yash","Hr",75000); 
		emp[2] = new Employee(3,"YashRaj","Assistant",60000); 
		emp[3] = new Employee(4,"Poojshree","Hr",75000);
		emp[4] = new Employee(5,"Snehal","CEO",100000);
		emp[5] = new Employee(5,"Priyal","Assistant",60000);
		emp[6] = new Employee(5,"Komal","Assistant",60000);
		emp[7] = new Employee(5,"Pranjal","Hr",75000);
		emp[8] = new Employee(5,"Tejashree","Hr",75000);
		emp[9] = new Employee(5,"Sanskar","Assistant",60000);
		
		for(Employee e: emp )
		{
			System.out.println(Arrays.toString(emp));
			if(e.dept=="Hr")
			{
				e.salary = e.salary + (e.salary*10/100);
				  System.out.println(e);
			}
			
			  
			else if(e.salary >= 60000)
			  {
				  System.out.println(e); 
			  }
		}
		}
		
	}


