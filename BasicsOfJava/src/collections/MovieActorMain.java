package collections;

import java.util.ArrayList;

public class MovieActorMain {

	public static void main(String[] args) {

		ArrayList<Movie> m = new ArrayList();
		MovieActorOperation ma = new MovieActorOperation();
		ma.setArrayListData(m);
		ma.display(m);
	}

}
