package comparable;

import java.util.ArrayList;
import java.util.Collections;

public class SortIntElementsAL {

	public static void main(String[] args) {

		ArrayList<Integer> ai = new ArrayList();
		
		ai.add(988);
		ai.add(54);
		ai.add(34);
		ai.add(21);
		ai.add(9);
		ai.add(100);
		
		System.out.println(ai);
		Collections.sort(ai);
		System.out.println(ai);
	}

}
