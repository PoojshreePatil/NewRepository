package polymorphism;

public class Shapes {

	
	void area(int a)
	{
		System.out.println("Area of Square:"+(a*a));
	}
	void area(int l,int b)
	{
		System.out.println("Area of Rectangle:"+(l*b));
	}
	void area(int b,float h)
	{
		System.out.println("Area of Triangle:"+((b*h)/2));
	}
	void area(float r)
	{
		System.out.println("Area of Circle:"+(3.142*r*r));
	}
	
	public static void main(String[] args) {

		
		Shapes s = new Shapes();
		s.area(4);
		s.area(6, 4);
		s.area(5, 2.5f);
		s.area(3.5f);
	}

}
