package collections;

import java.util.ArrayList;

public class ALCharacter {

	public static void main(String[] args) {

		ArrayList<Character> ac = new ArrayList();
		
		ac.add('p');
		ac.add('s');
		ac.add('b');
		ac.add('w');
		ac.add('v');
		ac.add('t');
		ac.add('p');
		ac.add('t');
		ac.add('b');
		ac.add('z');
		
		
		for(int i = 0;i<ac.size();i++)
		{   
			int cnt = 1;
			for(int j = i+1;j<ac.size();j++)
			 {
			    if(ac.get(i)== ac.get(j))
			    {
			     	cnt++;
				    ac.set(j, ' ');
			    }
			}
			if(ac.get(i)!= ' ')
			{
				System.out.println(ac.get(i)+" "+cnt);
			}
		}
	}
}

