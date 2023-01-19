package collections;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class EnumerationIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector<Integer> al = new Vector();
					
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(50);
		al.add(6);
		al.add(7);
		al.add(8);
		al.add(9);
		al.add(10);
		
		System.out.println(al);
		/*
		Iterator<Integer> itr = al.iterator();
		while(itr.hasNext())
		{
			if(itr.next()== 10)
			{
				al.add(1000);
			}
		}
		System.out.println(al);
			*/
		Enumeration<Integer> enu =  al.elements();
		while(enu.hasMoreElements())
		{
			if(enu.nextElement() == 10)
			{
				al.add(100);
			}
		}
		
		System.out.println(al);
	
	}

}
