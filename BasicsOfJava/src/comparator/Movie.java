package comparator;

import java.util.ArrayList;
import java.util.Iterator;

	public class Movie 
	{
	int id;
	String mname;
	String boxOfficeCollection;
	public ArrayList<Actor> ac;

	public Movie(int id, String mname, String boxOfficeCollection,ArrayList<Actor>ac ) 
	{
		
		this.id = id;
		this.mname = mname;
		this.boxOfficeCollection = boxOfficeCollection;
		this.ac=ac;
	}
	public String toString()
	{
		return  "\n"+id+" "+mname+" "+ boxOfficeCollection+" \nActors:"+ac+"\n";
	}
 }

