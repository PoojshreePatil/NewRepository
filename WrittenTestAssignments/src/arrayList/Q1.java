package arrayList;

import java.util.ArrayList;

public class Q1 {

	public static void main(String[] args) {
		
	
	ArrayList<String> al= new ArrayList<String>();
	
	al.add("Sun");
    al.add("Mon");
    al.add("Sat");
    al.add("Sun");
    al.add("Mon");
    al.add("Sat");
    al.add("Sun");
    al.add("Sat");
    al.add("Sun");
    al.add("Mon");
   
    ArrayList<String> all= new ArrayList();
   
          for(String ss:al)
           {
              if(!all.contains(ss))
               {
	               all.add(ss);
                }
           }
          System.out.println(all)  ;
}
}
