package collections;

import java.util.ArrayList;

public class TheaterMovieMain {

	public static void main(String[] args) {

		ArrayList<Theater> th = new ArrayList();
		
		TheartermovieOperations tm = new TheartermovieOperations();
		tm.setArrayList(th);
		tm.Display(th);
		tm.removeMovie(th);
		tm.Display(th);
			
	}

}
