package collections;

import java.util.ArrayList;

public class ArrayListMethods {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList();
		
		al.add(76);
		al.add(89);
		al.add(90);
		al.add(100);
		al.add(400);
		al.add(100);
		
		for(Integer i :al)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		al.add(2, 30);
		System.out.println(al);
		
		System.out.println(al.get(2));
		
        al.remove(1);
        System.out.println(al);
        
        System.out.println(al.contains(30));
        
        System.out.println(al.isEmpty());
        System.out.println("Index of 400 is: "+al.indexOf(400));
        System.out.println("last Index of 400 is: "+al.lastIndexOf(100));
        System.out.println(al.size());
      //  al.clear();
        System.out.println(al);
        
        
ArrayList<Integer> a2 = new ArrayList();
		
		a2.add(70);
		a2.add(80);
		a2.add(90);
		a2.add(120);
		a2.add(400);
		a2.add(150);
		
		for(Integer i2 :a2)
		{
			System.out.print(i2+" ");
		}
        System.out.println();
		al.addAll(a2);
		System.out.println(al);
		//al.addAll(1, a2);
		//System.out.println(al);
		
		
		  al.removeAll(a2);
		  System.out.println(al);
		 
		//al.retainAll(a2);
		//System.out.println(al);
		
		//al.set(0, 1);
		//System.out.println(al);
		
		//System.out.println(al.equals(a2));
		
	}

}
