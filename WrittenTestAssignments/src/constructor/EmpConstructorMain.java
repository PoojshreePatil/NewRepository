package constructor;

public class EmpConstructorMain {

	public static void main(String[] args) {
		
		Employee1 q = new Employee1();
		q.setId(1);
		q.setName("Pooja");
		q.setSalary(40000);
		
		System.out.println("Id: "+q.getId()+" Name: "+q.getName()+" Salary: "+q.getSalary());
		
		
      
		Employeeconstructor e = new Employeeconstructor();

		e.setId(2);
		e.setName("shree");
		e.setSalary(60000);
		
		System.out.println("Id:"+e.getId()+"  Name:"+e.getName()+"  Salary:"+e.getSalary());
		
		
		
		Employeeconstructor e1 = new Employeeconstructor(2,"poojshree",61000);

		e1.setId(3);
		e1.setName("Poojshree");
		e1.setSalary(50000);
		
		System.out.println("Id:"+e1.getId()+"  Name:"+e1.getName()+"  Salary:"+e1.getSalary());
		
		e.display();
		e1.display();
	}

}
