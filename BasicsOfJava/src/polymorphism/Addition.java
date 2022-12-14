package polymorphism;

public class Addition {

	
	void add(int a,int b)
	{
		System.out.println("Addition of int and int :"+(a+b));
	}
	void add(int a,String b)
	{
		System.out.println("Addition of int and String :"+(a+b));
	}
	void add(int a,float b)
	{
		System.out.println("Addition of int and float :"+(a+b));
	}
	void add(String a,String b)
	{
		System.out.println("Addition of String and String :"+(a+b));
	}
	void add(String a,int b)
	{
		System.out.println("Addition of String and int :"+(a+b));
	}
	
	void add(String a,float b)
	{
		System.out.println("Addition of String and float :"+(a+b));
	}
	
	void add(float a,float b)
	{
		System.out.println("Addition of float and float :"+(a+b));
	}
	
	public static void main(String[] args) {

		Addition a = new Addition();
		
		a.add(10, 20);
		a.add(20,"abc");
		a.add(10, 50.2f);
		a.add("afffa", "dffa");
		a.add("jhg", 10);
		a.add("asf", 12.0f);
		a.add(24.0f, 30.5f);
		
	}

}
