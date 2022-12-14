package inheritance;

public class Car1 {

	int id,price;
	String name,color;
	Engine1 e;
	
	Car1(int id,String name, int price,String color,Engine1 e)
	{
		this.id = id;
		this.name = name;
		this.price= price;
		this.color = color;
		this.e = e;
		
	}
	
	public String toString()
	{
		return "Id:"+id+"\nName:"+name+"\nPrice:"+price+"\nColor:"+color+"\nEngine:\n"+e;
	}
}
