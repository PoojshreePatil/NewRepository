package finalKeyword;

class A
{
	final int a = 42;
	static String city = "Aurangabad";
	
	void display()
	{
		System.out.println("In Parent class Display method "+a);
		System.out.println("City :"+city);
	}
}
class B extends A
{
	void display1()
	{
		city = "Chhatrapati Sambhaji Maharaj Nagar";
	   System.out.println("City :"+city);
   }
}
public class FinalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         B b = new B();
         b.display();
         b.display1();
	}

}
