package classesandobject;

import java.util.Scanner;

public class Employeepfcal {
	
	int id,salary;
	String name,dept;
	char rate;
	float bonus, pfsalary;
	void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the employee Id:");
		id =sc.nextInt();
		System.out.println("Enter the employee name:");
		name =sc.next();
		System.out.println("Enter the employee Salary:");
		salary =sc.nextInt();
		System.out.println("Enter the employee department:");
		dept =sc.next();
		System.out.println("Enter the employee rate between (A/B/C/D):");
		rate =sc.next().charAt(0);
        
		
	 }
     void bonus()
     {
    	
    	 if( rate == 'A')
    	 {
    	     bonus = salary*0.15f;
         }
    	 else if( rate == 'B')
    	 {
    	     bonus = salary*0.10f;
         }
    	 else if( rate == 'C')
    	 {
    	     bonus = salary*0.05f;
         }
    	 else
    	 {
    		 bonus = salary*0.0f;
    	 }
      } 
        void pfcalculate()
    	 {
    		pfsalary = salary* 0.10f;
    	 }

        void display()
        {
        	System.out.println("Name:"+name);
        	System.out.println("Salary : "+salary);
        	System.out.println("Bonus is: "+bonus);
        	System.out.println("Pf :"+pfsalary);
        }

	public static void main(String[] args) {

		Employeepfcal e = new Employeepfcal();
		e.input();
		e.bonus();
		e.pfcalculate();
		e.display();
	
	}

}
