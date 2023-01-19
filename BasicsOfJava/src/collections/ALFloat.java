package collections;

import java.util.ArrayList;

public class ALFloat {

	public static void main(String[] args) {

		
		ArrayList<Float> af = new ArrayList();
		
		af.add(10.3f);
		af.add(20.10f);
		af.add(3.70f);
		af.add(40.11f);
		af.add(50.2f);
		af.add(20.0f);
		
         float sum = 0;
         float avg = 0;
         
         for(int i = 0;i<af.size();i++)
         {
        	sum = sum + af.get(i);
         }
         System.out.println(sum);
         avg = sum / af.size();
         System.out.println(avg);
         
	}

}
