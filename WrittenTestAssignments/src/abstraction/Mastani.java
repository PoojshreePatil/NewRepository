package abstraction;

public class Mastani implements iceCream,juice {

	 public void eat()
	 {
		 System.out.println(" eating");
	 }
	public  void drink()
	 {
		 System.out.println("Drinking");
	 }
	
	
	public static void main(String[] args)
	{
		
		Mastani m = new Mastani();
		m.eat();
		m.drink();
	}

}
