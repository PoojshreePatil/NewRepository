package map;

import java.util.ArrayList;
import java.util.HashMap;

public class OrderStatusMain {

	void setElements(ArrayList<Order> ao1 )
	{
		ao1.add(new Order(11,200,"Swargate",new OrderStatus("17-1-2023","Delivered")));
		ao1.add(new Order(87,200,"Panvel",new OrderStatus("17-1-2023","Pending")));
		ao1.add(new Order(1,200,"Pune",new OrderStatus("17-1-2023","Pending")));
		ao1.add(new Order(101,200,"Hadapsar",new OrderStatus("17-1-2023","Delivered")));
		ao1.add(new Order(54,200,"Kharadi",new OrderStatus("17-1-2023","Pending")));
		ao1.add(new Order(871,200,"Katraj",new OrderStatus("17-1-2023","Delivered")));
		ao1.add(new Order(178,200,"Kothrud",new OrderStatus("17-1-2023","Pending")));

	}
	void createMap(ArrayList<Order> ao1 ,HashMap<String ,Integer> hm )
	{
		for(Order o:ao1)
		{
			String s = o.os.status;
			if(hm.containsKey(s))
			{
				hm.put(s, hm.get(s)+1);
			}
			else
			{
				hm.put(s, 1);
			}
		}
	}
	public static void main(String[] args) {

		ArrayList<Order> ao = new ArrayList();
		HashMap<String ,Integer> hm = new HashMap();
		OrderStatusMain osm = new OrderStatusMain();
		osm.setElements(ao);
		osm.createMap(ao, hm);
		System.out.println(ao);
		
		System.out.println(hm);
	}

}
