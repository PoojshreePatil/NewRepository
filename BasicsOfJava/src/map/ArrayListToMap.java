package map;

import java.util.ArrayList;
import java.util.HashMap;

public class ArrayListToMap {
	
public static void main(String[] args) 
	{
		ArrayList<Character> al=new ArrayList<>();
		
		al.add('a');
		al.add('g');
		al.add('h');
		al.add('a');
		al.add('g');
		al.add('h');
		al.add('x');
		al.add('a');
		al.add('d');
		al.add('r');
		al.add('a');
		al.add('d');
		al.add('r');
		al.add('x');

		System.out.println(al);
		
			
		HashMap<Character,Integer> hm=new HashMap<>();//a=4, r=2, d=2, g=2, h=2, x=2
		for(Character ch:al)     
		{
			if(hm.containsKey(ch))
			{
				int i=hm.get(ch);
				//i=i+1;       
				hm.put(ch, i+1);
			}
			else
			{
				hm.put(ch, 1);   
			}
		}
		System.out.println("how many times character is occure within a hashmap:");
		System.out.println(hm);
}
}
