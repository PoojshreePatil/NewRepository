package map;

import java.util.HashMap;
import java.util.Iterator;

public class AddElementsInHM {

	public static void main(String[] args) {
           
		HashMap<String ,Integer> hm = new HashMap();
		
		hm.put("Nivedita",21);
		hm.put("Shwetal",19);
		hm.put("Poojshree",20);
		hm.put("Swara",1);
		hm.put("Pranjal",2);
		hm.put("Priyal",6);
		hm.put("Tejashri",18);
		hm.put("Komal",21);
		hm.put("Snehal",22);
		hm.put("Vaishnavi",16);
		
		//for(String s: hm)
		{
			System.out.println(hm);
		}
		
		HashMapIterator<String,Integr> itr = hm.listiterator();
		
	}

}
