package assignment4;

public class Cycle {

	int accountNo, noOfWheels;
	Cycle()
	{
		System.out.println("I am Default Constructor");
	}
	Cycle(int accountNo, int noOfWheels)
	{
		this();
		System.out.println("I am Another Constructor");
	}
	public static void main(String[] args) {

		Cycle c = new Cycle();
		
		Cycle c1 = new Cycle(235237474,2);
		
	}

}
