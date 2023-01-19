package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class TheartermovieOperations {

	
	void setArrayList(ArrayList<Theater> t)
	{
		
		ArrayList<Movie1T> mv1 = new ArrayList();
		ArrayList<Movie1T> mv2 = new ArrayList();
		ArrayList<Movie1T> mv3= new ArrayList();
		//ArrayList<Movie1T> mv4 = new ArrayList();
		
		Movie1T m1 = new Movie1T();
		m1.setId(1);
		m1.setName("RRR");
		m1.setNoofshows(4);
		mv1.add(m1);
		
		Movie1T m2 = new Movie1T();
		m2.setId(20);
		m2.setName("Ved");
		m2.setNoofshows(5);
		mv1.add(m2);
		
		Movie1T m3 = new Movie1T();
		m3.setId(123);
		m3.setName("RamSetu");
		m3.setNoofshows(2);
		mv1.add(m3);
		
		
		Movie1T m4 = new Movie1T();
		m4.setId(101);
		m4.setName("Kantara");
		m4.setNoofshows(3);
		mv2.add(m4);
		
		Movie1T m5 = new Movie1T();
		m5.setId(20);
		m5.setName("Ved");
		m5.setNoofshows(4);
		mv2.add(m5);
		
		Movie1T m6 = new Movie1T();
		m6.setId(1);
		m6.setName("Avatar");
		m6.setNoofshows(4);
		mv2.add(m6);
		
		
		Movie1T m7 = new Movie1T();
		m7.setId(101);
		m7.setName("Kantara");
		m7.setNoofshows(3);
		mv3.add(m7);
		
		Movie1T m8 = new Movie1T();
		m8.setId(110);
		m8.setName("Vikram Veda");
		m8.setNoofshows(1);
		mv3.add(m8);
		
		Theater t1 = new Theater();
		t1.setId(121);
		t1.setName("Inox");
		t1.setM(mv1);
		t.add(t1);
		
		Theater t2 = new Theater();
		t2.setId(1001);
		t2.setName("SFC");
		t2.setM(mv2);
		t.add(t2);
		
		Theater t3 = new Theater();
		t3.setId(989);
		t3.setName("City Pride");
		t3.setM(mv3);
		t.add(t3);
		
	}
	
	void Display(ArrayList<Theater> t)
	{
		for(Theater thr : t)
		{
			System.out.println(thr);
		}
	}
	void removeMovie(ArrayList<Theater> t)
	{
		for(Theater thr : t)
		{
			Iterator<Movie1T> mtr = thr.m.iterator();
			while(mtr.hasNext())
			{
				if(mtr.next().noofshows <= 2)
				{
					mtr.remove();
				}
			}
		}
		System.out.println("\n.................Movies Removed From Theater which have less than 3 shows..................\n ");
	}
}
