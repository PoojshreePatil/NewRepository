package Comparable;

import java.util.ArrayList;
import java.util.Collections;

public class IntegerArrayList {
   void elements(ArrayList<Integer> al1)
   {
	   al1.add(45);
	   al1.add(89);
	   al1.add(10);
	   al1.add(100);
	   al1.add(2);
   }
   void sortList(ArrayList<Integer> al1)
   {
		Collections.sort(al1);
   }
	void descendingsort(ArrayList<Integer> al1)
	{
		Collections.sort(al1);
		Collections.reverse(al1);
	}
	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList();
		
		IntegerArrayList ial = new IntegerArrayList();
		
		ial.elements(al);
		System.out.println(al);
		
		ial.sortList(al);
		System.out.println(al);
		ial.descendingsort(al);
		
		System.out.println(al);
		
	}

}
