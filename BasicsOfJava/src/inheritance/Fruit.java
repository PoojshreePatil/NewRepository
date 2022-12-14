package inheritance;

public class Fruit {

	void taste()
	{
		System.out.println("Fruits are Sweet in taste");
	}
}
 class Apple extends Fruit
{
	 void taste()
		{
			System.out.println("Apples are Sweet in taste");
		}
	
}
 class Mango extends Fruit
{
	 void taste()
		{
			System.out.println("Mangoes are Sweet in taste");
		}
}