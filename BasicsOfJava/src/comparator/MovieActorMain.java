package comparator;

import java.util.ArrayList;
import java.util.Collections;

	public class MovieActorMain
	{
	  public static void main(String[] args)
	  {
		
		ArrayList<Movie> am =new ArrayList<>(); 
		MovieOperation mo =new MovieOperation ();

	    mo.details(am);
	    
	    System.out.println(am);
	    
	   // mam.remove(mv);
	   // System.out.println(am);
	    
	    
	    System.out.println("Acter Sort using Comparator Based on Actor name");
	    for(Movie m : am)
	    {
	       Collections.sort(m.ac,new MovieSortActorName());
		   System.out.println(m);
	    }
		
	}
}
