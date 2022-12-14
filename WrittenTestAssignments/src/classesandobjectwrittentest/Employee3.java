package classesandobjectwrittentest;
import java.util.Scanner;
public class Employee3 {

			int id;
			String name;
			String dept;
			float salary;
			long contact;
			float bonus;
			float pfsalary;
			char rate;
			

			void setData() {

				Scanner sc = new Scanner(System.in);
				System.out.println("Enter Employee id :");
				id = sc.nextInt();
				System.out.println("Enter a Employee name :");
				name = sc.next();
				System.out.println("Enter a Employee Dept :");
				dept = sc.next();
				System.out.println("Enter a Employee Salary :");
				salary = sc.nextFloat();
				System.out.println("Enter a Employee Contact :");
				contact = sc.nextLong();
				System.out.println("Enter the Employee rate between(A/B/C/D)");
				rate = sc.next().charAt(0);

			}

			void bonus() {

				if (rate == 'A') {

					bonus = salary * 0.15f;
				}
				else if (rate == 'B') {

					bonus = salary * 0.10f;
				}
				else if (rate == 'c') {

					bonus = salary * 0.05f;
				}
				else {
					bonus = salary * 0.0f;
				}
					
				// System.out.println("Bonus is :"+bonus);

			}

			void pfcalculator() {

				pfsalary = salary * 0.15f;

			}

			void display() {
				System.out.println("Employee Nmae :" + name);
				System.out.println("Employee salary :" + salary);
				System.out.println("Bonus :" + bonus);
				System.out.println("pf :" + pfsalary);
			}

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				Employee3 e = new Employee3();
				e.setData();
				e.bonus();
				e.pfcalculator();
				e.display();
			}
}
