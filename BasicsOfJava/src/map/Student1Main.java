package map;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Student1Main {

	void setElements(HashMap<Student1, Integer> st1)
	{
		st1.put(new Student1(201,"Poojshree","Computer",90),22);
		st1.put(new Student1(101,"Nivedita","Computer",88),77);
		st1.put(new Student1(1,"Payal","Mechanical",85),45);
		st1.put(new Student1(10,"Anjali","Computer",89),33);
		st1.put(new Student1(44,"Akshata","Civil",92),23);
		st1.put(new Student1(43,"Megha","Civil",89),12);
		st1.put(new Student1(41,"Tejashri","Civil",92),43);
		st1.put(new Student1(40,"Shruti","Entc",86),34);
		st1.put(new Student1(22,"Sharmila","Electrical",78),27);
		st1.put(new Student1(35,"Pratibha","Entc",84),25);
		st1.put(new Student1(73,"Shraddha","Mechanical",91),21);
		st1.put(new Student1(73,"Shraddha","Mechanical",91),24);
		//st1.put(new Student1(73,"Shraddha","Entc",91),22);
		
	}
	
	
	public static void main(String[] args) {

		LinkedHashMap<Student1, Integer> hms = new LinkedHashMap();
		//hms.put(new Student1(73,"Shraddha","Entc",91),22);
		Student1Main sm = new Student1Main();
		sm.setElements(hms);
		System.out.println(hms);
	}

}
