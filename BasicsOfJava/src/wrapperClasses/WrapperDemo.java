package wrapperClasses;

public class WrapperDemo {

	public static void main(String[] args) {

		
		int i = 10;
		Integer it = new Integer(i);
		
		Integer it1 = i;
		Integer it2 = new Integer(i);
		
		System.out.println(it == it2);
		System.out.println(it.equals(it2));
		
		Integer a =  new Integer(1000);
		int t = a.intValue();
		
		int g = a;
		
	    Character ch = new Character ('s');
	    char c = ch;
	    
	    char x = 'l';
	    Character cht = x;
		
	    System.out.println(t == g);
	    System.out.println(x == c);
	    
	}

}
