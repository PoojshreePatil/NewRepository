package comparator;

import java.util.ArrayList;
import java.util.Collections;

public class FacultyMain {

	void setElements(ArrayList<Faculty> af1)
	{
		af1.add(new Faculty(1,80000,"Mr.S.V.Patil","Algebra","Mathematics"));
		af1.add(new Faculty(87,70000,"Mr.D.A.Patil","Electronics","Electronics"));
		af1.add(new Faculty(76,60000,"Mr.K.B.Kumbhar","C#","BCS"));
		af1.add(new Faculty(101,40000,"Mrs.P.Pachore","SE","BCS"));
		af1.add(new Faculty(171,40000,"Miss.K.S.Jesvani","Java","BCS"));
		
	}
	public static void main(String[] args) {

		ArrayList<Faculty> af = new ArrayList();
		
		
		FacultyMain fm = new FacultyMain();
		fm.setElements(af);
		System.out.println(af);
		
		System.out.println(".....Sorting using Comparator based on Department...........");
		Collections.sort(af, new FacultySortDept());
		System.out.println(af);
	}

}
