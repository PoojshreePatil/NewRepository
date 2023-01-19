package arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class RemoveDuplicateElement {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList();
		
        al.add("Sun");
        al.add("Mon");
        al.add("Sat");
        al.add("Sun");
        al.add("Mon");
        al.add("Sat");
        al.add("Sun");
        al.add("Sat");
        al.add("Sun");
        al.add("Mon");

       // System.out.println(al);
		
	/*	  for(int i = 0;i<al.size();i++)
		  {
			  if(al.get(i)!= " ")
			  {
				  int count = 0;
			    for(int j =i+1;j<al.size();j++)
			    {
			    	if((al.get(i)).equals(al.get(j)))
			    	{
			    		if(count == 0)
		                 {
			    			System.out.println(al.get(i));
                            al.set(j, " "); 
                            count ++;
                         }
			    	}
			    }
		}
}*/
		 
        
	
	  ArrayList<String> all = new ArrayList<String>(); 
	  for(String ss: al) 
	  {
	     if(!all.contains(ss))
	     {
	    	 all.add(ss);
	      }
	  }
	  System.out.println(all);
	  
	}
        
        /*for(int i = 0;i<al.size();i++)
        {
        	if(!al.get(i).equals(" "))
        	{
        		System.out.println(al.get(i));
        	}
        }*/
        
		/*
		 Iterator<String> itr = al.iterator();
		 while(itr.hasNext()) 
		 { 
			 if(itr.hasNext()) 
		}
		 */
	}


