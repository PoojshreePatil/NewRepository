package arrayObject;

import java.util.Arrays;

public class Theater1 {

	int id;
	String name;
	Movie1 m[];
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Movie1[] getM() {
		return m;
	}
	public void setM(Movie1[] m) {
		this.m = m;
	}
	public String toString()
	{
		return "\nId: " +id+"  Name: "+name+"\nMovie Details:  "+ Arrays.toString(m);
	}
}
