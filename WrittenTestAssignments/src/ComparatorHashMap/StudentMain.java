package ComparatorHashMap;

import java.util.ArrayList;
import java.util.Collections;

public class StudentMain {

	void  setElements(ArrayList<Student> st)
	{
		st.add(new Student(101,20,"Poojshree"));
		st.add(new Student(761,15,"Yashraj"));
		st.add(new Student(23,22,"Snehal"));
		st.add(new Student(199,17,"Priyal"));
		st.add(new Student(1,12,"Pranjal"));
		
	}
	public static void main(String[] args) {

		ArrayList<Student> as = new ArrayList();
		StudentMain sm = new StudentMain();
		sm.setElements(as);
		System.out.println(as);
		
		System.out.println("\n......Sorting of Student based on Roll no.........\n");
		Collections.sort(as, new SortStudentByRollNo());
		System.out.println(as);
		
		System.out.println("\n......Sorting of Student based on Age.........\n");
		Collections.sort(as, new SortStudentByAge());
		System.out.println(as);
		
		System.out.println("\n......Sorting of Student based on Name.........\n");
		Collections.sort(as, new SortStudentByName());
		System.out.println(as);
	}

}
