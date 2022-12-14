package inheritance;

class Rectangle extends Shapes
{
	void area()
	{
		int width = 3;
		System.out.println("Width:"+width);
		System.out.println("Area of rectangle:"+(length * width));
	}

}