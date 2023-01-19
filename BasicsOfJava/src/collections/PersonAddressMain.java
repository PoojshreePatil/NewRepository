package collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class PersonAddressMain {

	void elements(ArrayList<Person> al1)
	{
		al1.add(new Person(1,"Poojshree","9112995105",new Address("Pune","Maharashtra","India")));
		al1.add(new Person(2,"Pooja","9115667510",new Address("Sangli","Maharashtra","India")));
		al1.add(new Person(3,"Shree","9876785105",new Address("Kolhapur","Maharashtra","India")));
		al1.add(new Person(4,"YashRaj","9112989927",new Address("Pune","Maharashtra","India")));
		al1.add(new Person(5,"Snehal","9373916105",new Address("Mumbai","Maharashtra","India")));
		
	}
	
	void displayCityWise(ArrayList<Person> per)
	{
		for(Person p : per)
		{
			if(p.add.city.equalsIgnoreCase("Pune"))
			{
				System.out.println(p);
			}
		}
	}
	void removeCity(ArrayList<Person> per)
	{
		ListIterator<Person> ltr = per.listIterator();
		while(ltr.hasNext())
		{
			if(ltr.next().add.city.equalsIgnoreCase("Sangli"))
			{
				ltr.remove();
			}
		}
	}
	void removeCity1(ArrayList<Person> per)
	{
		ListIterator<Person> ltr = per.listIterator();
		while(ltr.hasNext())
		{
			if(ltr.next().add.city.equals((ltr.next().id == 2)))
			{
				ltr.remove();
			}
		}
	}
	
	
	public static void main(String[] args) {

		ArrayList<Person> al = new ArrayList();
		
		PersonAddressMain pa = new PersonAddressMain();
		//Person per = al;
	    pa.elements(al);
		System.out.println(al);
		//pa.displayCityWise(al);
		//pa.removeCity(al);
		System.out.println(al);
		
	}

}
