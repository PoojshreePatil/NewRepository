package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ALMethod {

	public static void main(String[] args) {

		
	ArrayList<Integer> al= new ArrayList<>();
		
		al.add(10);
		al.add(657);
		al.add(40);
		al.add(10);
		al.add(100000);
		al.add(35);
		al.add(9897);
		al.add(12);
		al.add(98);
		
		
		for(Integer i: al)
		{
			System.out.print(i+" ");
		}
		System.out.println("\n-----------------Iterator----------------");
		Iterator<Integer> itr = al.iterator();
		while(itr.hasNext())
		{
		  System.out.print(itr.next()+" ");
		}
		
		System.out.println("\n-----------------List Iterator in Forward Direction----------------");
		ListIterator<Integer> litr = al.listIterator();
		while(litr.hasNext())
		{
		  System.out.print(litr.next()+" ");
		}
		
		System.out.println("\n----------------- List Iterator in BackWord Direction----------------");
		ListIterator<Integer> litr1 = al.listIterator(al.size());
		while(litr1.hasPrevious())
		{
		  System.out.print(litr1.previous()+" ");
		}
		
	}

}
