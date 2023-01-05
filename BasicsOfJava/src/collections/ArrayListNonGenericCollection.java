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
			
			for(Object o: al)
			{
				System.out.println(o);
			}

		}
	}

