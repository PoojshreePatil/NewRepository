package collections;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteAL {
// FailSafe Iterator
	public static void main(String[] args) {

		CopyOnWriteArrayList<Integer> al = new CopyOnWriteArrayList();
		
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
		Iterator<Integer>  itr = al.iterator();
		while(itr.hasNext())
		{
			if(itr.next() == 1)
			{
				al.add(100);
				al.remove(5);
			}
		}
		System.out.println(al);
	}

}
