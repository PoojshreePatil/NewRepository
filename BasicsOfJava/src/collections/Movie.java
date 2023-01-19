package collections;

import java.util.ArrayList;

public class Movie {

	int id;
	String name;
	float boc;
	ArrayList<Actor> a;
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
	public float getBoc() {
		return boc;
	}
	public void setBoc(float boc) {
		this.boc = boc;
	}
	public ArrayList<Actor> getA() {
		return a;
	}
	public void setA(ArrayList<Actor> a) {
		this.a = a;
	}
	@Override
	public String toString() {
		return "Movie id=" + id + ", name=" + name + ", boc=" + boc + "Actor : " + a ;
	}
	
	
	
}
