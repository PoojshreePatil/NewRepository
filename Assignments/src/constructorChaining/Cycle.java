package constructorChaining;

public class Cycle {

	int accountNo, noOfWheels;
	public Cycle() {
      
		System.out.println("I am default constructor");
	}

	Cycle(int a)
	{
		this();
		System.out.println("This is another Constructor");
	}
	public static void main(String[] args) {

		//Cycle c = new Cycle();
		Cycle c1 = new Cycle(1);
	}

}
