package arrayObject;

import java.util.Arrays;

public class Theater {

	int id;
	String name;
	Movie m[];
	
     public Theater(int id, String name,Movie[] m) {
		
		this.id = id;
		this.name = name;
		this.m = m;
	}
	
	public String toString()
	{
		return "\nId: " +id+"  Name: "+name+"\nMovie Details:  "+Arrays.toString(m);
	}
}
