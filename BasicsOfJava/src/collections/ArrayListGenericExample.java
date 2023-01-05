package collections;

	import java.util.ArrayList;

	public class ArrayListGenericExample
	{
		
		public static void main(String[] args)
		
		{
			
		ArrayList<Integer> al= new ArrayList<>();
		
		al.add(10);
		al.add(657);
		al.add(40);
		al.add(10);
		al.add(100000);
		al.add(35);
		al.add(9897);
		al.add(12);
		al.add(98);
		
		
		for(Integer i: al)
		{
			System.out.println(i);
		}

	}
}
