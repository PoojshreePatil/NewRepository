package InheritanceParentchild;

class Animal
{
	String type;
   Animal()
   {
	   System.out.println("Default Constructor");
   }
   Animal(String type1)
   {
	   type = type1;
	   System.out.println("Type of Animal:"+type1);
	   
   }
}
class Dog extends Animal
{
	String name,type;
	Dog(String name,String type)
	{
		super("Labra");
		this.name = name;
		this.type = type;
		System.out.println("Name:"+name+"\n Type:"+type);
	}
}

public class Constructor1Main {

	public static void main(String[] args) {

		Dog d = new Dog("tom","germon");
	}
}	
	
	
	
	
	
	
	
	


