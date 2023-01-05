package assignmentContainment;

public class EmployeeMain {

	public static void main(String[] args) {

		Dept d1 = new Dept();
		d1.setDept_id(1);
		d1.setDept_name("Computer");
		
		Mydate m1 = new Mydate();
		m1.setDay(1);
		m1.setMonth(2);
		m1.setYear(2022);
		
		Employee e = new Employee();
		e.setId(1);
		e.setName("Poojshree");
		e.setSalary(25000);
		e.setD(d1);
		e.setM(m1);
		
		
		
		System.out.println(e);
	}

}
