package interfacePrograms;

interface Mobile
{
	void calling();
	void messaging();
	void fm();
	void torch();
	void calender();
	void calculator();
	void battery();
	void display();
}

class SmartPhone implements Mobile
{

	void applications()
	{
		System.out.println("Many Applications In Smartphones");
	}
	void highPixelCamera()
	{
		System.out.println("Smatphones have Highpixel Camera");
	}
	@Override
	public void calling() {
		{
			System.out.println("Calling ");
		}
	}

	@Override
	public void messaging() {
       System.out.println("Messaging");		
	}

	@Override
	public void fm() {
        System.out.println("FM");		
	}

	@Override
	public void torch() {
      System.out.println("Torch");		
	}

	@Override
	public void calender() {
       System.out.println("Calender");		
	}

	@Override
	public void calculator() {
		  System.out.println("Calulator");
	}

	@Override
	public void battery() {
		  System.out.println("Battery");		
	}

	@Override
	public void display() {
		  System.out.println("Display");		
	}
	
}

class NormalPhone implements Mobile
{
	void snakeGame()
	{
		System.out.println("Snake Game is in Normal Phone");
	}
	@Override
	public void calling() {
		{
			System.out.println("Calling ");
		}
	}

	@Override
	public void messaging() {
       System.out.println("Messaging");		
	}

	@Override
	public void fm() {
        System.out.println("FM");		
	}

	@Override
	public void torch() {
      System.out.println("Torch");		
	}

	@Override
	public void calender() {
       System.out.println("Calender");		
	}

	@Override
	public void calculator() {
		  System.out.println("Calulator");
	}

	@Override
	public void battery() {
		  System.out.println("Battery");		
	}

	@Override
	public void display() {
		  System.out.println("Display");		
	}
	
}

public class MobileMain {

	public static void main(String[] args) {
		System.out.println("\n***********SmartPhones  Info******************\n");
		SmartPhone s = new SmartPhone();
		s.applications();
		s.highPixelCamera();
		s.calling();
		s.messaging();
		s.fm();
		s.calender();
		s.calculator();
		s.battery();
		s.display();
		
		System.out.println("\n***********NormalPhone Info******************\n");
		NormalPhone n = new NormalPhone();
		n.snakeGame();
		n.calling();
		n.messaging();
		n.fm();
		n.calender();
		n.calculator();
		n.battery();
		n.display();
	}

}
