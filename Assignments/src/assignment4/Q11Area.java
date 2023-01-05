package assignment4;
/*
11.Create a class to print the area of a square and a rectangle. The class has 
two methods with the same name but different number of parameters. The 
method for printing area of rectangle has two parameters which are length 
and breadth respectively while the other method for printing area of 
square has one parameter which is side of square.
*/

public class Q11Area {

	void area(int s)
	{
		System.out.println("Area of Square is:"+(s*s));
	}
	void area(int l,int b)
	{
		System.out.println("Area of Rectangle:"+(l * b));
	}
	public static void main(String[] args) {

		Q11Area a = new Q11Area();
		a.area(5);
		a.area(4, 2);
	}

}
