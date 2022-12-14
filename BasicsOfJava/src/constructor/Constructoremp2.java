package constructor;

public class Constructoremp2 {

	int id,salary;
	String name,dept;
	
	Constructoremp2()
	{
		id = 1;
		name = "Shree";
		salary = 60000;
		dept = "Computer";
	}
	void display()
	{
		System.out.println(id +" "+name +" "+salary+" "+dept+" ");
	}
	
	public String toString()
	{
		return id +"\n "+name +"\n "+salary+"\n"+dept+"\n ";
	}
	public static void main(String[] args) {
		Constructoremp2 e2 = new Constructoremp2();
		System.out.println(e2);

	}

}
