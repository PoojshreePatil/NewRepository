package interfacePrograms;

 interface TestCar
 {
	void milage(int power);
	void crash();
	void speedTest(int speed);
	void breakTest();
	void loadTest();
	
 }

 class Swift implements TestCar
 {
    void objectDetails()
    {
    	System.out.println("car is Swift");
    }
	@Override
	public void milage(int power) {
       System.out.println("Milage  is :"+power);		
	}

	@Override
	public void crash() {
       System.out.println("Crash");		
	}

	@Override
	public void speedTest(int speed) {
        System.out.println("Speed:"+speed);		
	}

	@Override
	public void breakTest() {
        System.out.println("Break Testing");		
	}

	@Override
	public void loadTest() {
        System.out.println("Load Testing");		
	}
	 
 }

public class CarMain {

	public static void main(String[] args) {

		Swift s = new Swift();
		s.objectDetails();
		s.milage(200);
		s.crash();
		s.speedTest(120);
		s.breakTest();
		s.loadTest();
	}

}
