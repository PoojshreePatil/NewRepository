package wrapperClasses;

public class ValueOfMethod {

	public static void main(String[] args) {

		Integer i = Integer.valueOf(100);
		System.out.println(i);

	    Integer i1 = Integer.valueOf("1000");
	    System.out.println(i1);
	    
	    Integer i2 = Integer.valueOf("1010", 2);
	    System.out.println(i2);
	    
	    Integer i3 = Integer.valueOf("4321", 5); // 4*5^3  + 3*5^2 +  2*5^1  +  1*5^0
	    System.out.println(i3);                  //  4* 125   + 3 * 25  + 2*5 + 1* 1
	                                             // 500 + 75 +10+1   =586
	    
	    
	    //Integer i3 = Integer.valueOf("3210", 4); // 3*4^3 + 2*4^2+   1*4^1 + 0*4^0
	   // System.out.println(i3);      
	    //
	    Float f = Float.valueOf(10.2f);
	    System.out.println(f);
	    
	    Float f1 = Float.valueOf("52.42");
	    System.out.println(f1);

	    Character c = Character.valueOf('p');
	    System.out.println(c);
	    
	    Double d = Double.valueOf(10.2);
	    System.out.println(d);
	    
	    Double d1 = Double.valueOf("52.42");
	    System.out.println(d1);
	    
	    Boolean b = Boolean.valueOf(false);
	    System.out.println(b);
	    
	    Boolean b1 = Boolean.valueOf("true");
	    System.out.println(b1);
	}

}
