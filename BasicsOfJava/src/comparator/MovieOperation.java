package comparator;

import java.util.ArrayList;
import java.util.Iterator;


	public class MovieOperation
	{
		void details(ArrayList<Movie> mva)
		{
			ArrayList<Actor> a1=new ArrayList<>();
			ArrayList<Actor> a2=new ArrayList<>();
			ArrayList<Actor> a3=new ArrayList<>();
			ArrayList<Actor> a4=new ArrayList<>();
			ArrayList<Actor> a5=new ArrayList<>();
			
			
			a1.add(new Actor(76,"Amitabh bacchan"));
			a1.add(new Actor(35,"shahrukh khan"));
			a1.add(new Actor(24,"kajol"));
			a1.add(new Actor(56,"jaya bacchan"));
			
			
			a2.add(new Actor(30,"Ranbir kapoor"));
			a2.add(new Actor(20,"Aalia bhatt"));
			a2.add(new Actor(76,"Amitabh bacchan"));
			a2.add(new Actor(25,"Mony roy"));
			

			a3.add(new Actor(30,"salman khan"));
			a3.add(new Actor(29,"arbaj khan"));
			a3.add(new Actor(21,"rani mukharji"));
			
			
			a4.add(new Actor(31,"Ajay devagan"));
			a4.add(new Actor(38,"Tushar kapoor"));
			a4.add(new Actor(23,"Karina kapoor"));
			a4.add(new Actor(22,"Shreyas talpade"));
			a4.add(new Actor(50,"Mithun chakravathi"));
			

			a5.add(new Actor(76,"Amitabh bacchan"));
			a5.add(new Actor(35,"Shahrukh khan"));
			a5.add(new Actor(26,"Juhi chawala"));
			
			mva.add(new Movie(1,"Kabhi khushi kabghi gum","5 cr",a1));
			mva.add(new Movie(2,"Bhramhastra","1 cr",a2));
			mva.add(new Movie(3,"Hello brother","4 cr",a3));
			mva.add(new Movie(4,"Golmal","10 cr",a4));
			mva.add(new Movie(2,"Bhuthnath","2 cr",a5));
		}

		void remove(ArrayList<Movie> mm)
		{
			System.out.println("after removing :");
			Iterator<Movie> itr=mm.iterator();
			while(itr.hasNext())
			{
				Movie m=itr.next();
				for(Actor a1: m.ac)
				{
					if(a1.name.equalsIgnoreCase("Amitabh bacchan"))
					{
						itr.remove();
					}
				}
			}
	/*   Iterator<MovieAC> mitr=mm.iterator();
			while(mitr.hasNext())
			{
				MovieAC m=mitr.next();
				Iterator<Actor> aitr=m.ac.iterator();
				while(aitr.hasNext())
				{
				 if()	
				}
			}*/
			
		}
	}

