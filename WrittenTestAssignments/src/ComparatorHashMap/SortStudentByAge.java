package ComparatorHashMap;

import java.util.Comparator;

public class SortStudentByAge implements Comparator<Student>
 {

	public int compare(Student s1, Student s2) {
		
		if(s1.age > s2.age)
		    return 1;
		if(s1.age < s2.age)
		    return -1;
		else 
			return 0;
	}

 }
