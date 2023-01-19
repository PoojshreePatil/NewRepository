package comparable;

import java.util.ArrayList;
import java.util.Collections;

public class SortElementsAL {

	public static void main(String[] args) {
		
		ArrayList<String> as = new ArrayList();
		
		as.add("Yestrday");
		as.add("Today");
		as.add("Tommorrow");
		
		
		System.out.println(as);
		Collections.sort(as);
		System.out.println(as);
	}

}
