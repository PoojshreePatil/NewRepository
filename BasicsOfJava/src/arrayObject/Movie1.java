package arrayObject;

public class Movie1 {

	private int id,releaseyear;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getReleaseyear() {
		return releaseyear;
	}
	public void setReleaseyear(int releaseyear) {
		this.releaseyear = releaseyear;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String toString()
	{
		return "\nId: " +id+"  Name: "+name+" Release Year: "+releaseyear;
	}
}
