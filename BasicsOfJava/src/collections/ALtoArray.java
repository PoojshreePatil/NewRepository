package collections;

import java.util.ArrayList;
import java.util.Arrays;

public class ALtoArray {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList();
		
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(120);
		
		/*
		 * for(Integer i :al) { System.out.print(i+" "); }
		 */
		
		Object a[] = al.toArray();
		//System.out.println(a);
		 int ar[] = new int[al.size()];   //ArrayList to Array
		  for(int i = 0;i<ar.length;i++)
		  {
			  ar[i] = al.get(i);
		  }
		System.out.println(Arrays.toString(ar));
		System.out.println("************************");
		  //System.out.println("\n.....ArrayList to Array......");
		  Integer arr[] = {1,2,3,4,5,6,7,8,9,10};  //Wrapper to ArrayList
		  ArrayList<Integer> ai = new ArrayList(Arrays.asList(arr));
		 // al.toArray(arr); // arrayList ....specified wrapper class
		 // System.out.println(al);
		 System.out.println("************************");
		 int in[] = {10,20,30,100,200};
		 ArrayList<Integer> s = new ArrayList();
		 for(Integer i :al)
		 { 
			 s.add(i);
			// System.out.print(i+" ");
		 }
	    System.out.println(s);
	}

}
