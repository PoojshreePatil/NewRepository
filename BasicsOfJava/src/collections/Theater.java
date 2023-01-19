package collections;

import java.util.ArrayList;

public class Theater {

	int id;
	String name;
	ArrayList<Movie1T> m;
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
	public ArrayList<Movie1T> getM() {
		return m;
	}
	public void setM(ArrayList<Movie1T> m) {
		this.m = m;
	}
	@Override
	public String toString() {
		return "Theater id=" + id + " name=" + name + "\nMovies In Theater =" + m ;
	}
	
	
}
