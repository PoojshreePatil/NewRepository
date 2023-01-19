package collections;

import java.util.ArrayList;

public class ALString {

	public static void main(String[] args) {

		ArrayList<String> as = new ArrayList();
			
		as.add("peek");
		as.add("seek");
		as.add("beak");
		as.add("weak");
		as.add("veer");
		as.add("Tree");
		
		for(String s: as)
		{
			if(s.contains("ee"))
			{
			    System.out.println(s);	
	     	}
			
		}
	}

}
