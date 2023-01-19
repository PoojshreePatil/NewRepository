package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListMethods {

	public static void main(String[] args) {

        LinkedList<Integer> al = new LinkedList();
        
        al.add(1);
        al.add(4);
		al.add(2);
		al.add(1);
		al.add(3);
		al.add(1);
		al.add(4);
		
		HashMap<String,Integer> hm = new HashMap();
		
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
        /*
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(20);
		al.add(120);
		al.add(120);
		al.add(100);
		al.add(50);
		al.add(150);
		
		/*
		int cnt = 0;
		for(int i = 0;i<al.size();i++)
		{
			if(al.get(i) == 20)
			{
				cnt++;
			}
		}
		System.out.println(cnt);
		
		
		/*
		 * for(int i = 0;i<al.size();i++) { for(int j = i+1;j<al.size();j++) {
		 * if(al.get(i)== al.get(j)) { al.remove(j); } } } System.out.println(al);
		 */
		/*
		  ArrayList<Integer> al1 = new ArrayList<>();
		  
		  for(Integer i : al)
		  {
			  if(!al1.contains(i))
			  {
				  al1.add(i);
			  }
		  }
		  System.out.println(al1);
		 
		
		*/
		
		/*
		 * al.addFirst(100); System.out.println(al);
		 * 
		 * al.addLast(200); System.out.println(al);
		 * 
		 * 
		 * Iterator <Integer> itr = al.descendingIterator(); while(itr.hasNext()) {
		 * System.out.print(itr.next()+" "); }
		 * 
		 * System.out.println();
		 * 
		 * Collections.sort(al); System.out.println(al); Collections.reverse(al);
		 * System.out.println(al);
		 * 
		 * System.out.println(Collections.frequency(al, 20));
		 */
		
	}

}
