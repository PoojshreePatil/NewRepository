package collections;

import java.util.ArrayList;

public class Student2Main {

	public static void main(String[] args) {

		ArrayList<Student2> std = new ArrayList(2);
		ArrayList<Integer> marks = new ArrayList(5);
		Student2Operations so = new Student2Operations();
		so.setArrayList(std);
		so.percentage(std);
		//so.grade(percent);
	}

}
