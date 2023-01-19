package map;

import java.util.HashMap;

public class HashMapMethods {

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
		
		System.out.println("Contains Key: "+hm.containsKey(60));
		System.out.println("Contains Value : "+hm.containsValue("Raj"));
	
		System.out.println(hm.get(89));
		System.out.println(hm.getOrDefault(10, "Raj"));
		
		//System.out.println("Is Empty:"+hm.isEmpty());
		
		
		 // hm.clear(); System.out.println(hm);
		 
		
		
		//hm.remove(10);
		//System.out.println(hm);
		
		hm.remove(190, "yash");
		System.out.println(hm);
		
		hm.replace(1, "Geet");
		System.out.println(hm);
		System.out.println(hm.size());
		
		
         HashMap<Integer,String> hm1 = new HashMap<>();
		
		hm1.put(109, "Kavya");
		hm1.put(160, "Raghav");
		
		System.out.println(hm1);
		hm.putAll(hm1);
		System.out.println(hm);
		
        HashMap<Integer,String> hm2 = new HashMap<>(hm1);
		
        System.out.println(hm2);
	}

}
