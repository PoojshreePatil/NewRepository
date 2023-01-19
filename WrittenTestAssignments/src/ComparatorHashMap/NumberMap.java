package ComparatorHashMap;

import java.util.ArrayList;
import java.util.HashMap;

public class NumberMap 
   {
	  void create( ArrayList<Integer> al1, HashMap<String,Integer> hm1 )
	   {
		 for(Integer i :al1)     
		 {
		   String name =" ";
			switch(i)
			{
			   case 1:
				name = "one";
				break;

			   case 2:
				name = "two";
				break;
				
			   case 3:
				name = "three";
				break;
					
			   case 4:
				name="four";
				break;
			}
		  
			if(hm1.containsKey(name))
			{
				int a = hm1.get(name);      
				hm1.put(name, a+1);
			}
			else
			{
				hm1.put(name, 1);   
			}
		}
		//System.out.println(hm1);
	}
	 
		public static void main(String[] args) 
		{
			  ArrayList<Integer> al = new ArrayList();
			  
			    al.add(1);
		        al.add(4);
				al.add(2);
				al.add(1);
				al.add(3);
				al.add(1);
				al.add(4);
			  
			  
			  HashMap<String,Integer> hm = new HashMap();
			  
			  NumberMap nm = new NumberMap();
			  nm.create(al, hm);
			  System.out.println(al);
			  System.out.println(hm);
			  
		}
	}


