package constructor;

public class Constructor {

	int id,salary;
	String name;
	
	Constructor(int i,String n,int s)
	{
		id = i; 
		name = n;
		salary = s;
	}
	Constructor(Constructor c)
	{
		id = c.id; 
		name = c.name;
		salary = c.salary;
	}
	
	void display()
	{
		System.out.println("Id:"+id+"  Name:"+ name+"  Salary:"+ salary);
	}
	public static void main(String[] args) {

		Constructor c = new Constructor(1,"Pooshree",60000);
		Constructor c1 = new Constructor(c);
		c.display();
		c1.display();
		
	}

}
