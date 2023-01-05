package assignment4;

public class Q12Student {

	/*
	 12.Create a class 'Student' with three data members which are name, age and 
        address. It has two methods with the same name set_Info(). First method 
        has two parameters for name and age and assigns the same whereas the 
        second method takes has three parameters which are assigned to name, 
        age and address respectively. Print the name, age and address.
	 */
	
	int age;
	String name,address;
	
	void set_Info(String name,int age)
	{
		System.out.println("In two parametrized method");
		System.out.println("Name of Student:"+name);
		System.out.println("Age of Student:"+age);
	}
	void set_Info(String name,int age,String address)
	{
		System.out.println("In Three parametrized method");
		System.out.println("Name of Student:"+name);
		System.out.println("Age of Student:"+age);
		System.out.println("Address of Student:"+address);
	}
	
	public static void main(String[] args) {
		

		Q12Student s = new Q12Student();
		s.set_Info("yash", 15);
		s.set_Info("Raj",14, "Irali");
	}

}
