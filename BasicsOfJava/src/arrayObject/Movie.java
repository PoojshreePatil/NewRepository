package arrayObject;

public class Movie {

	int id,releaseyear;
	String name;
	
	public Movie(int id,  String name,int releaseyear) {
		
		this.id = id;
		this.releaseyear = releaseyear;
		this.name = name;
	}
	
	public String toString()
	{
		return "\nId: " +id+"  Name: "+name+" Release Year: "+releaseyear;
	}
	
}
