package staticeg;

public class StaticNonStatic {

	int id = 1;
	String name = "Manorama";
	static String  collegenm = "DYPatil";
	
	static void method()
	{
		System.out.println("Inside the Static method:");
		System.out.println(collegenm);
		StaticNonStatic s = new StaticNonStatic();
		System.out.println(s.id);
		System.out.println(s.name);
		
		
	}
	public static void main(String[] args) {

	
		StaticNonStatic s1 = new StaticNonStatic();
		s1.method();
	}

}
