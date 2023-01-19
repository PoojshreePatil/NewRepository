package collections;

public class Movie1T {

	int id,noofshows;
	String name;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNoofshows() {
		return noofshows;
	}
	public void setNoofshows(int noofshows) {
		this.noofshows = noofshows;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return " "+" Movie id=" + id + " noofshows=" + noofshows + " name=" + name;
	}
	
	
}
