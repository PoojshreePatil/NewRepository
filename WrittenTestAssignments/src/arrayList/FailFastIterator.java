package arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class FailFastIterator {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList();
		
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(50);
		al.add(6);
		al.add(7);
		/*
		for(Integer i : al)
		{
			al.add(10);
		}
		*/
		Iterator<Integer> itr = al.iterator();
		while(itr.hasNext())
		{
			if(itr.next()== 1)
			{
			//int i = itr.next();
			//System.out.println(itr.next());
				al.add(100);
				//al.remove(2);
			//itr.remove();
			}
		}
		
		System.out.println(al);
	}

}
