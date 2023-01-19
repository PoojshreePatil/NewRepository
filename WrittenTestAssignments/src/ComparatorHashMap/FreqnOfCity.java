package ComparatorHashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class FreqnOfCity {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList();
		
		al.add("pune");
		al.add("Mumbai");
		al.add("pune");
		al.add("Mumbai");
		al.add("Nasik");
		al.add("pune");

      // System.out.println(al);
       
       HashMap<String , Integer> hm = new HashMap();
       
       for(String s:al)     
		{
			if(hm.containsKey(s))
			{
				int i = hm.get(s);      
				hm.put(s, i+1);
			}
			else
			{
				hm.put(s, 1);   
			}
		}
       System.out.println(hm);
	}

}
