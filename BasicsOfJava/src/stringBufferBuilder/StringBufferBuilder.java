package stringBufferBuilder;

public class StringBufferBuilder {

	public static void main(String[] args) {

		
		StringBuffer sbf = new StringBuffer("Java Language");
		System.out.println(sbf.capacity());
		System.out.println(sbf);
		sbf.append("Core");
		System.out.println(sbf);
		
		System.out.println(sbf.reverse());
		System.out.println(sbf.length());
		System.out.println(sbf.reverse());
		System.out.println(sbf.deleteCharAt(4));
		
		System.out.println(sbf.insert(4, " is "));
		sbf.setCharAt(7, 'a');
		System.out.println(sbf);
		
	}

}
