package abstraction;

public abstract class Car {
	
	int speed;
	Car(int speed)
	{
		System.out.println("Speed of Car:"+speed);
	}
	void wheelno()
	{
		System.out.println(" Every car have 4 wheels ");
	}
	void headlightno()
	{
		System.out.println("There are two headlights");
	}
	
	 abstract void dashboard();
	 abstract void safetyfeature();
	 abstract void buildquality();
	 

 }



//abstract int id;
	/*
	 * int id;
	 * 
	 * 
	 * public int getId() { return id; } public void setId(int id) { this.id = id; }
	 */

	 
