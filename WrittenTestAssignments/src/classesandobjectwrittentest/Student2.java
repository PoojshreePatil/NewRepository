package classesandobjectwrittentest;

public class Student2 {

	public static void main(String[] args) {
		Student2 s1 = new Student2();
		Student2 s2 = new Student2();
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		System.out.println(s1);
		System.out.println(s2);
		
	}

}











//int a = s1.hashCode();
		//int b = s2.hashCode();
		//System.out.println("hashcode:"+a);
		//System.out.println("hashcode:"+b);
		//System.out.println("compareing: " +s1.equals(s2));