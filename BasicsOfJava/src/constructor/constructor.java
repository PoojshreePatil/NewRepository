package constructor;
import java.util.Scanner;

public class constructor {

	int rollno;
	String name,Class;
	
	constructor(int rollno,String name,String Class)
	{
		this.rollno = rollno;
		this.name = name ;
		this.Class = Class;
		this.display();
	}
	void display()
	{
		System.out.println(rollno +" \n"+name+" \n"+Class+" \n");
	}
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the rollno ,name,Class:");
		int rollno = sc.nextInt();
		String name = sc.next();
		String Class = sc.next();
		
		constructor c = new constructor(rollno,name,Class);
		//c.display();

	}

}
