package collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LIteratorString {

	public static void main(String[] args) {

		LinkedList<String> names = new LinkedList();
		
		names.add("Poojshree");
		names.add("Manorama");
		names.add("Shivani");
		names.add("Swarali");
		names.add("Rutuja");
		
		for(String s : names)
		{
			System.out.print(s +" ");
		}
		System.out.println("\n..........Iterator.........");
		Iterator<String> itr = names.iterator();
		while(itr.hasNext())
		{
		  System.out.print(itr.next()+" ");
		}
		
		System.out.println( "\n\n ...............List Iterator.............");
		ListIterator<String> lstr = names.listIterator();
		while(lstr.hasNext())
		{
			System.out.print(lstr.next()+" ");
		}
		
		System.out.println( "\n\n ......List Iterator in Bakword Direction......");
		ListIterator<String> blstr = names.listIterator(names.size());
		while(blstr.hasPrevious())
		{
			System.out.print(blstr.previous()+" ");
		}
		
		
	}

}
