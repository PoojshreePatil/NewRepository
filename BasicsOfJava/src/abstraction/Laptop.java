package abstraction;

public class Laptop extends Electronics {
	
	Laptop()
	{
		super(60000,"Black",2);
		System.out.println("Child class constructor");
	}
	void rating()
	{
		System.out.println("Rating:4 Star");
	}
    void electricityConsumption()
   {
	   System.out.println("electricity Consumption: 50-100 W/Hr");
   }
   void features()
   {
	   System.out.println("featurs: hard drive,Graphic cards,processor");
   }
}
