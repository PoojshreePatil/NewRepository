package InheritanceUsingAbstractClassExamples;

abstract class Parent {

	String name;
	Parent(String name)
	{
		this.name = name;
		System.out.println("Name: " +name);
		System.out.println("Parent Class Constructor");
	}
	void cook()
	{
		System.out.println("cooking food");
	}

	void wash()
	{
		System.out.println("Washing.....");
	}
}

class Child extends Parent 
{
	Child()
	{
		super("Parent1");
		System.out.println("Child Constructor");
		
	}
	void cook()
	{

		System.out.println("cooking..");
	}  
}

public class ParentChildMain {

	public static void main(String[] args) {

		Child c = new Child();
		c.cook();
		c.wash();
	}

}
