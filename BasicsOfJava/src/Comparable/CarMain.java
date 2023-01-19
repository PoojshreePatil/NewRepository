package Comparable;

import java.util.ArrayList;
import java.util.Collections;

public class CarMain {

	void setElements(ArrayList<Car> ac1)
	{
		//ac1.add(new Car(1,1500000,2010,"Thar","Mahindra"));
		ac1.add(new Car(45,1500000,2010,"Thar","Mahindra"));
		ac1.add(new Car(109,1500000,2019,"Seltos","Kia"));
		ac1.add(new Car(111,1000000,2022,"Sonet","Kia"));
		ac1.add(new Car(154,1064000,2019,"Creta","Hyundai"));
		ac1.add(new Car(67,1460000,1998,"Safari -XE","Tata"));
		ac1.add(new Car(81,1460000,2019,"Harrier","Tata"));
	
	}
	
	public static void main(String[] args) {

		ArrayList<Car> ac = new ArrayList();
		
		
		CarMain c1 = new CarMain();
		c1.setElements(ac);
		System.out.println(ac);
		Collections.sort(ac);
		System.out.println(ac);
	}

}
