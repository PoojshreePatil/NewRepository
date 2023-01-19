package collections;

import java.util.ArrayList;

public class ALCharacter1 {

	public static void main(String[] args) {

    ArrayList<Character> ac = new ArrayList();
		
		ac.add('p');
		ac.add('s');
		ac.add('b');
		ac.add('a');
		ac.add('w');
		ac.add('v');
		ac.add('t');
		ac.add('a');
		ac.add('p');
		ac.add('t');
		ac.add('b');
		ac.add('z');
		
		for(int i = 0;i<ac.size();i++)
		{
			if(ac.get(i)== 'a')
			{
				ac.add(i+1, 'z');
				
			}
		
	}
		System.out.println(ac);

}
}