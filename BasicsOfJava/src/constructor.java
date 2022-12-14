import java.util.Scanner;

public class constructor {

	int rollno;
	String name,Class;
	
	constructor(int rollno,String name,String Class)
	{
		this.rollno = rollno;
		this.name = name ;
		this.Class = Class;
	}
	
	void display()
	{
		System.out.println(rollno +" \n"+name+" \n"+Class+" \n");
	}
	public String toString()
	{
		return rollno +" \n"+name+" \n"+Class+" \n";
	}
	public static void main(String[] args) {

		for(int i =1;i<=3;i++)
		{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the rollno ,name,Class:");
		int rollno = sc.nextInt();
		String name = sc.next();
		String Class = sc.next();
		constructor c = new constructor(rollno,name,Class);
		System.out.println(c);
		
	//	c.display();
		}
	}

}
