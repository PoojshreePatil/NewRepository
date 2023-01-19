package arrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class ReverseLL {

	public static void main(String[] args) {

		LinkedList<String> al= new LinkedList<String>();
		
		al.add("Sun");
	    al.add("Mon");
	    al.add("Tue");
	    al.add("Wed");
	    al.add("Thu");
	    al.add("Fri");
	    al.add("Sat");
	    
	    ListIterator<String> l =al.listIterator(al.size());
	   // Iterator<String> l =al.descendingIterator();
	    while(l.hasPrevious())
	    {
	    		System.out.print(l.previous()+" ");
	    }
	}

}
