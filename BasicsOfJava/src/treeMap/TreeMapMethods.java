package treeMap;

import java.util.TreeMap;

public class TreeMapMethods {

	void setElements(TreeMap<Integer,String> tm1)
	{
		tm1.put(100, "pushpa");
		tm1.put(22, "Ashwin");
		tm1.put(25, "Dipti");
		tm1.put(88, "Chirag");
		tm1.put(80, "Prerana");
		tm1.put(42, "Rashi");
		tm1.put(40, "Aryan");
		tm1.put(2, "Dilip");
	}
	public static void main(String[] args) {
          
		TreeMap<Integer,String> tm = new TreeMap();
		TreeMapMethods tmm = new TreeMapMethods();
		tmm.setElements(tm);
		System.out.println(tm);
		
		for(Integer i :tm.descendingKeySet())
		{
			System.out.print(i+" ");
		}
		System.out.println();
		
		System.out.println("First Key:"+tm.firstKey());
		System.out.println("Last Key:"+tm.lastKey());
		
		System.out.println("First Entry: "+tm.firstEntry());
		System.out.println("Last Entry: "+tm.lastEntry());
		
	    System.out.println("Floor key:"+tm.floorKey(50));
	    System.out.println("Floor Entry:"+tm.floorEntry(50));
	    
	    System.out.println("Ceiling key:"+tm.ceilingKey(50));
	    System.out.println("Ceiling Entry:"+tm.ceilingEntry(100));
	    
	    System.out.println("Tail map:"+tm.tailMap(42));
	    System.out.println("Tail map:"+tm.tailMap(42, false));
	    
	    System.out.println("Sub map:"+tm.subMap(42,100));
	    System.out.println("Sub map:"+tm.subMap(42,true,100,true));
	    
	}

}
