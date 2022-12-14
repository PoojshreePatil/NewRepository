package inheritance;

public class Car2 {

	int id,price;
	String name,color;
	Driver d;
	
	Car2(int id,String name, int price,String color,int did,String dname,String contact)
	{
		this.id = id;
		this.name = name;
		this.price= price;
		this.color = color;
		
		d = new Driver(did,dname,contact);
		
	}
	
	public String toString()
	{
		return "Id:"+id+"\nName:"+name+"\nPrice:"+price+"\nColor:"+color+"\nDriver\n"+d;
	}

}
