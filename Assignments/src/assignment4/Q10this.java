package assignment4;

public class Q10this {
/*
	10.Show the use of this keyword in Program –
	a. with a field(Instance Variable)
	b. with Constructor
	c. with Method
*/
	int id;
	String name;
	
	void input(int id,String name)
	{
		this.id = id;
		this.name = name;
		System.out.println("Id :"+this.id);
		System.out.println("Name:"+this.name);
	}
	Q10this()
	{   
		this(1,"shree");
		System.out.println("This is Default Constructor");
	}
	Q10this(int id,String name)
	{
		this.input(1, "Shree");
		System.out.println("THis is parametrized Constructor");
	}
	
	public static void main(String[] args) {

		Q10this t = new Q10this();
	
	}

}
