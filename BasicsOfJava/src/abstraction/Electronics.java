package abstraction;

public abstract class Electronics {

	int price ;
	String colour;
	float weight;
	
	Electronics(int price ,String colour,float weight)
	{
		  this.price =price;
		  this.colour = colour;
		  this.weight = weight;
		 
		System.out.println("Price:"+price+"\nColour:"+colour+"\nWeight:"+weight);
		
	}
	void  processor()
	{
		System.out.println("There are 5 processors");
	}
	void semiconductor()
	{
		System.out.println("There are 2 semiconductors");
	}
	
	abstract void rating();
	abstract void electricityConsumption();
	abstract void features();
	
}
