package inheritance;

public class CarEngineMain {

	public static void main(String[] args) {

		Engine e1 = new Engine();
		e1.setCylinder(4);
		e1.setTorque(90);
		e1.setCompany("Tata");
		e1.setPower("1000 rpm");
		
		Car c1 = new Car();
		c1.setId(1);
		c1.setName("Kia");
		c1.setPrice(750000);
		c1.setE(e1);
		
		System.out.println("Information of Car");
		System.out.println("Id:"+c1.getId()+"\nName:"+c1.getName()+"\nPrice:"+c1.getPrice());
		System.out.println("Information of Engine \n"+ c1.getE());
	}

}
