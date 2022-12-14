package classesandobject;

import java.util.Scanner;

public class Employee2 {

	
			int id,salary,contact;
			String name,dept;
			float bonus,pfsalary;
			char ch;
			
			void input() {
				

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
				ch =sc.next().charAt(0);
		        
				/*
				 * Scanner sc = new Scanner(System.in);
				 * System.out.println("Employee Information"); System.out.println("Employee id:"
				 * + id); id=sc.nextInt(); System.out.println("Employee Name:" + name);
				 * name=sc.next(); System.out.println("Employee salary: " + salary);
				 * salary=sc.nextInt(); System.out.println("Employee Dept.:" + dept);
				 * dept=sc.next(); System.out.println("Contact.No:" + contact);
				 * contact=sc.nextInt(); System.out.println("Rating (A/B/C/D)");
				 * ch=sc.next().charAt(0);
				 */
			
			}
			
			void bonus() {
				//float bonus;
				if (ch == 'A')
					bonus = salary * 0.15f;
				else if (ch == 'B')
					bonus = salary  * 0.10f;
				else if (ch == 'C')
					bonus = salary * 0.05f;
				else
					bonus = salary*0.0f;
				//System.out.println("salary after bonus"+ bonus);
				//return bonus;
			}
			
			void pfcalculate() {
				//float pfsalary;
				pfsalary=salary*0.10f;
				//return salary;
				
			}
			void display() {
				System.out.println("Name:"+name);
				System.out.println("Salary:"+salary);
				System.out.println("Bonus:"+bonus);
				System.out.println("PF:"+pfsalary);
			}
			
			public static void main(String[] args) {
				
				Employee2 e=new Employee2();
				
				e.input();
				e.bonus();
				e.pfcalculate();
				e.display();
				
			}

		}
	
