package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class CarMain {

	
	void delete(ArrayList<Car> ac)
	{
		Iterator<Car>ic = ac.iterator();
		while(ic.hasNext())
		{
			if(ic.next().lyear==1990)
			{
				ic.remove();
			}
		}
		System.out.println(ac);
	}
	public static void main(String[] args) {

		ArrayList<Car> car = new ArrayList();
		{	
		Car c1 = new Car();
		c1.setName("Swift");
		c1.setPrice(600000);
		c1.setLyear(2020);
		c1.setBrandname("Swift Desire");
		car.add(c1);
		
		Car c2 = new Car();
		c2.setName("Kia");
		c2.setPrice(800000);
		c2.setLyear(2021);
		c2.setBrandname("Kia 1");
		car.add(c2);
		
		Car c3 = new Car();
		c3.setName("Maruti");
		c3.setPrice(500000);
		c3.setLyear(1990);
		c3.setBrandname("Maruti800");
		car.add(c3);
		}
		
		CarMain cr = new CarMain();
		cr.delete(car);
	}	
}
