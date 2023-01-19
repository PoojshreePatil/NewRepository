package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class MapIteration {

	public static void main(String[] args) {

HashMap<Integer,String> hm = new HashMap<>();
		
		hm.put(1, "Reet");
		hm.put(60, "Gaurav");
		hm.put(90, "Riya");
		hm.put(2, "Tina");
		hm.put(89, "34");
		hm.put(10, "Sachin");
		hm.put(190, null);
		
		System.out.println(hm);
		System.out.println("\n..........Traversing using Key..........\n");
		for(Integer i : hm.keySet())
		{
			System.out.print(i+" ");
		}
		System.out.println("\n..........Traversing using Values..........\n");
		for(String s : hm.values())
		{
			System.out.print(s+" ");
		}
		System.out.println("\n..........Traversing using Map.Entry..........\n");
		for(Map.Entry<Integer,String> m: hm.entrySet())
		{
			System.out.print(m.getKey()+" "+m.getValue()+" ");
		}
		
		System.out.println("\n..........Traversing using Iterator..........\n");
		Iterator<Map.Entry<Integer,String>> itr1 = hm.entrySet().iterator();
		while(itr1.hasNext())
		{
			System.out.print(itr1.next()+" ");
		}
		
		
		
	}

}
