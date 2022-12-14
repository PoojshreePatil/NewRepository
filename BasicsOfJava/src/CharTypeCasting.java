
public class CharTypeCasting {
	public static void main(String[] args) {
		char ch = 'A';
		int i = ch;
		i = i + 32;
		System.out.println("Uppercase to Lowercase:\n" +(char) i);
		char c = 'a';
		int j = c;
		j = j - 32;
		System.out.println("Lowercasr to Uppercase:\n"+(char) j);
	}
}
