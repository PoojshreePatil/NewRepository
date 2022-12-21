package string;

public class AdditionofAlphabates {

	public static void main(String[] args) {
         String s = "KITE";
		//String s = "WORLD";
		String s1[] = s.split("");
		
		char ch[] = s.toCharArray();
		int sum =0;
		for(int i = 0;i< s.length();i++)
		{
			sum = sum + ch[i] - 64;
		}
		System.out.println(s+" ="+sum);
	}

}
