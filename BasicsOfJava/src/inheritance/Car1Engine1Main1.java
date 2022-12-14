package inheritance;

public class Car1Engine1Main1 {

	public static void main(String[] args) {

		Engine1 e1 = new Engine1(4,90,"Tata","1000 rpm");
		Car1 c1 = new Car1(1,"Kia",750000,"White",e1);
		
		System.out.println(c1);
	}

}
