package staticeg;

public class StaticNonStatic {

	int id = 1;
	String name = "poojshree";
	static String  collegenm = "KWC";
	
	static void method()
	{
		//StaticNonStatic.collegenm;
		System.out.println("Inside the Static method:");
		
		StaticNonStatic s = new StaticNonStatic();
		System.out.println(s.id);
		System.out.println(s.name);
		
		
	}
	public static void main(String[] args) {

	
		StaticNonStatic s1 = new StaticNonStatic();
		s1.method();
	}

}
