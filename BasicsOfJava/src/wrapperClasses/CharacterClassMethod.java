package wrapperClasses;

public class CharacterClassMethod {

	public static void main(String[] args) {

		char ch = '8';
		
		int i = Character.getNumericValue(ch);
		System.out.println(i);
		
		System.out.println("Digit:"+ Character.isDigit(ch));
		System.out.println("Character:"+ Character.isLetter(ch));
		System.out.println("LowerCase:"+ Character.isLowerCase(ch));
		System.out.println("UpperCase:"+ Character.isUpperCase(ch));
		System.out.println("WhiteSpace:"+ Character.isWhitespace('\t'));
		System.out.println("Identifier:" +Character.isJavaIdentifierPart('m'));
		System.out.println(Character.isJavaLetterOrDigit('$'));
		System.out.println(Character.MAX_VALUE);
		System.out.println(Character.MIN_VALUE);
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		System.out.println(Integer.max(10,29));
		System.out.println(Integer.compare(20, 10));
		
		System.out.println(Integer.toBinaryString(5));
		System.out.println(Integer.toHexString(5));
		System.out.println(Integer.toOctalString(5));
		
		System.out.println(Integer.sum(100, 39));
		//System.out.println(Integer.p);
		
	}

}
