package map;

import java.util.HashMap;
import java.util.Map;

public class RemoveEntryHM {
	//73.	 Create a hashmap <int,String> where key is integers 1 to 10 and string is number in words.
	//     Remove entry for which number is divisible by 3
	
	void setdata( HashMap<Integer, String > hm )
	{
		hm.put(1,"One");
		hm.put(2,"Two");
		hm.put(3,"Three");
		hm.put(4,"Four");
		hm.put(5,"Five");
		hm.put(6,"Six");
		hm.put(7,"Seven");
		hm.put(8,"Eight");
		hm.put(9,"Nine");
		hm.put(10,"Ten");
	}
	void removeElement(HashMap<Integer, String > hm )
	{System.out.println("{");
		for(Map.Entry<Integer,String> m: hm.entrySet())
		{
			if(m.getKey() % 3 != 0)
		       System.out.print(+m.getKey()+" "+m.getValue()+" ");
			
		}
	System.out.println("}");
		/*
		for(Integer i : hm.keySet())
		{
			if( i % 3 == 0)
			{
				System.out.println(i);
			}
		}
		*/
	}
	public static void main( String[] args)
	{
	      HashMap<Integer, String > hm = new HashMap();
      
	      RemoveEntryHM rhm = new RemoveEntryHM();
	      rhm.setdata(hm);
	      rhm.removeElement(hm);
	     // System.out.println(hm);
	      
	}

}
