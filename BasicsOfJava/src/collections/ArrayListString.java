package collections;

import java.util.ArrayList;

public class ArrayListString {

	public static void main(String[] args) {

		ArrayList<String> al= new ArrayList<>();
		
		al.add("January");
		al.add("February");
		al.add("March");
		al.add("April");
		al.add("May");
		al.add("June");
		al.add("July");
		al.add("August");
		al.add("September");
		al.add("October");
		al.add("November");
		al.add("December");
		for(String s : al)
		{
			if(s.contains("e"))
			{
				System.out.println(s);
	    	  //System.out.println(s.length());
	     }
	}
}
}