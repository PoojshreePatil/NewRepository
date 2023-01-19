package map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.TreeMap;

public class MappingEx {

	public static void main(String[] args) {

		HashMap<Integer,String> hm = new HashMap<>();
		
		hm.put(1, "Reet");
		hm.put(60, "Gaurav");
		hm.put(90, "Riya");
		hm.put(2, "Tina");
		hm.put(89, "34");
		hm.put(10, "Sachin");
		
		//hm.put(89, "100");
		//.replace(89, "100");
		System.out.println(hm);
		
		
		LinkedHashMap<Integer,String> lm = new LinkedHashMap<>();
		
		lm.put(1, "Reet");
		lm.put(60, "Gaurav");
		lm.put(90, "Riya");
		lm.put(2, "Tina");
		lm.put(89, "34");
		lm.put(10, "Sachin");
		
		System.out.println(lm);
		
		TreeMap<Integer,String> tm = new TreeMap<>();
		

		tm.put(1, "Reet");
		tm.put(60, "Gaurav");
		tm.put(90, "Riya");
		tm.put(2, "Tina");
		tm.put(11, "34");
		tm.put(10, "Sachin");
		System.out.println(tm);
		
	}

}
