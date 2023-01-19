package collections;

import java.util.ArrayList;
import java.util.Scanner;

public class MovieActorOperation 
   {
     Scanner sc = new Scanner(System.in);
     
	void setArrayListData(ArrayList<Movie> ma)
	{
		System.out.println("Enter the size of No of Movies");
		int size = sc.nextInt();
		ArrayList<Movie> ma1 = new ArrayList();
		
		for(int i = 0;i< size;i++)
		{
			Scanner sc1 = new Scanner(System.in);
		    System.out.println("Enter the Movie  id,name,Box Of Collection:");
			int mid = sc.nextInt();
			String mname = sc1.nextLine();
			float boc = sc.nextFloat();
			
		  
		   System.out.println("Enter the size of No of actors");
		   int size1 = sc.nextInt();
		   ArrayList<Actor> a = new ArrayList();
		   for(int j = 0;j< size1;j++)
		   {
			   //Scanner sc2 = new Scanner(System.in);
			System.out.println("Enter th actor id,name,age:");
			int id = sc.nextInt();
			String name = sc1.nextLine();
			int age = sc.nextInt();
			
		     Actor a1 = new Actor();
		     a1.setId(id);
		     a1.setName(name);
		     a1.setAge(age);
		     a.add(a1);
		     
		  }
			Movie m1 = new Movie();
			m1.setId(mid);
			m1.setName(mname);
			m1.setBoc(boc);
			m1.setA(a);
			ma.add(m1);   
		     
		}
	}
		     
		     
		     
		/*
		      Actor a1 = new Actor();
		     a1.setId(12);
		     a1.setName("Amitab Bachchan");
		     a1.setAge(80);
		     a.add(a1);
		     
	       	Actor a2 = new Actor();
	     	a2.setId(26);
		    a2.setName("Akshay Kumar");
		    a2.setAge(55);
		    a.add(a2);
		
		    Actor a3 = new Actor();
		    a3.setId(30);
		    a3.setName("Anil Kapur");
		    a3.setAge(66);
		    a.add(a3);
		
		    Actor a4 = new Actor();
		    a4.setId(72);
		    a4.setName("Govinda");
		    a4.setAge(59);
		    a.add(a4);
		
		}
		Movie m1 = new Movie();
		m1.setId(56);
		m1.setName("Sholay");
		m1.setBoc(390);
		m1.setA(a);
		ma.add(m1);
		
		Movie m2 = new Movie();
		m2.setId(36);
		m2.setName("Phir hera pheri");
		m2.setBoc(69.12f);
		m2.setA(a);
		ma.add(m2);
		
		Movie m3 = new Movie();
		m3.setId(56);
		m3.setName("Beta");
		m3.setBoc(24);
		m3.setA(a);
		ma.add(m3);
		
		Movie m4 = new Movie();
		m4.setId(56);
		m4.setName("Coolie N0.1");
		m4.setBoc(21.22f);
		m4.setA(a);
		ma.add(m4);
		*/
	
	void display(ArrayList<Movie> ma)
	{
		for(Movie me : ma)
		{
			System.out.println(me);
		}
	}
	
	
}
