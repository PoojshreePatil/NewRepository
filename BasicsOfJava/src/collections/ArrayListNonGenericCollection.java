package collections;
import java.util.ArrayList;
public class ArrayListNonGenericCollection {

	public static void main(String[] args) {

			ArrayList al= new ArrayList();
			
			al.add(10);
			al.add('a');
			al.add("India");
			al.add(10.20);
			al.add(10);
			al.add(20);
			al.add(20);
			al.add(43);
			al.add(67.5647);
			al.add(new Student(101,"nnnn"));
			
			
			for(Object o :al)
			{
				System.out.print(o+" ");
			}
			System.out.println("\n");
			System.out.print("\n"+ al.get(2)+"\n ");
			for(int i = 0;i<al.size();i++)
			{
				System.out.print(al.get(i)+" ");
			}
			System.out.println();
			for(Object o: al)
			{
				String s = o.getClass().getSimpleName();
				if(s.equalsIgnoreCase("Integer"))
				System.out.print(o+" ");
			}

		}
	}

