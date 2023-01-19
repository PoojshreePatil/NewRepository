package comparator;

import java.util.Comparator;

public class MovieSortActorName implements Comparator<Actor>{

	public int compare(Actor o1, Actor o2) 
	{
		return (o1.name.compareTo(o2.name));
	}

}
