package constructor;

public class Constructor1 {

	Constructor1()
	{
		this(100,300);
		System.out.println("Simple Constructor");
	}
	Constructor1(int a)
	{
		this(45,77,56);
		System.out.println("one Parametrized Constructor");
	}
	Constructor1(int a,int b)
	{
		this(20);
		System.out.println("Two Parametrized Constructor");
	}
	Constructor1(int a,int b,int c)
	{
		
		System.out.println("Three Parametrized Constructor");
	}
	public static void main(String[] args) {


		Constructor1 c = new Constructor1();
	}

}
