package Comparable;

public class Car implements Comparable<Car>
  {
	
	int id,price,lyear;
	String name,brand;
	public Car(int id, int price, int lyear, String name, String brand) {
	
		this.id = id;
		this.price = price;
		this.lyear = lyear;
		this.name = name;
		this.brand = brand;
	}
	@Override
	public String toString() {
		return "\n Car id:" + id + ", price:" + price + ", lyear:" + lyear + ", name:" + name + ", brand:" + brand ;
	}
	
	public int compareTo(Car c)
	{
		if(this.brand.compareTo(c.brand)== 0)
		{
			if(this.price > c.price)
				return 1;
			else if(this.price < c.price)
				return -1;
			else 
				return (this.name.compareTo(c.name));
		}
		else
			return (this.brand.compareTo(c.brand));
	}

}
