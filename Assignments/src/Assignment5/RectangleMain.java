package Assignment5;

 class Rectangle {

	/*
	 * 6. Create a class named 'Rectangle' with two data members 'length' and
	 * 'breadth' and two methods to print the area and perimeter of the rectangle
	 * respectively. Its constructor having parameters for length and breadth is
	 * used to initialize length and breadth of the rectangle. Let class 'Square'
	 * inherit the 'Rectangle' class with its constructor having a parameter for its
	 * side (suppose s) calling the constructor of its parent class as 'super(s,s)'.
	 * Print the area and perimeter of a rectangle and a square
	 */
	
	
	int length,breadth;
	
	Rectangle(int length,int breadth)
	{
		this.length = length;
		this.breadth = breadth;
		System.out.println("Constructor of Rectangle"+(length * breadth));
	}
	void area()
	{
		System.out.println("Area of Rectangle:"+(length * breadth));
	}
	void parimeter()
	{
		System.out.println("Perimeter of Rectangle:"+(2*(length + breadth)));
	}
	
}
	class Square extends Rectangle
	{
		int side;
		Square(int s)
		{
			super(10,5);
		    s = side;
		}
		
		void area()
		{
			System.out.println("Area of Square:"+(side * side));
		}
		void parimeter()
		{
			System.out.println("Perimeter of Square:"+(4 * side));
		}
	}

class RectangleMain{
	

	public static void main(String[] args) {
		
		
		//Rectangle r = new Rectangle(5,3);
		Square s1 = new Square(6);
		s1.area();
		s1.parimeter();
	}
}

