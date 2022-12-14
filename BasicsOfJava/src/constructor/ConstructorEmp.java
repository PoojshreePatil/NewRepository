package constructor;

public class ConstructorEmp {

	int id,salary;
	String name, dept;
	ConstructorEmp()
	{
		id = 1;
		name = "Poojshree";
		salary = 50000;
		dept = "computer";
	}
	void display()
	{
		System.out.println(id+" "+salary+" "+name+" "+ dept+" ");
	}
	
	
	public static void main(String[] args) {

		ConstructorEmp e = new ConstructorEmp();
		e.display();
		
		ConstructorEmp e1 = new ConstructorEmp();
		e1.display();
		
		
	}

}
