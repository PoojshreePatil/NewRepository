package treeMap;

import java.util.TreeMap;

public class PersonTreeMap {

	void setdata(TreeMap<Person, Integer> tm)
	{
		tm.put(new Person(1,"Poojshree","poojshree@gmzail.com","Pune"), 20);
		tm.put(new Person(671,"Pooja","pooja@gmzail.com","Mumbai"), 30);
		tm.put(new Person(123,"shree","shree@gmzail.com","Mumbai"), 23);
		tm.put(new Person(156,"Nivedita","nivedita@gmzail.com","Pune"), 21);
		tm.put(new Person(40,"Yashraj","yashraj@gmzail.com","Delhi"), 18);
		tm.put(new Person(54,"Raj","raj@gmzail.com","Nashik"), 15);
		tm.put(new Person(4,"Raj","raj@gmzail.com","Pune"), 25);
		
	}
	public static void main(String[] args) {

		TreeMap<Person, Integer> tm = new TreeMap<>(new PersonNameComparator());
		PersonTreeMap pm = new PersonTreeMap();
		pm.setdata(tm);
		System.out.println(tm);
	}

}
