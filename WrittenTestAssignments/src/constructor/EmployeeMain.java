package constructor;

public class EmployeeMain {

	public static void main(String[] args) {

		Employee  e = new Employee();
		e.setId(1);
		e.setName("Poojshree");
		e.setSalary(50000);
		e.display();
				
		Employee  e1 = new Employee(2,"Patil",50000);
		e1.display();
	}

}
