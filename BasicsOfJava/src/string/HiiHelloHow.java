package string;

public class HiiHelloHow {

	public static void main(String[] args) {

		String s1 = "Hello";
		String s2 = "How";
		String s3 = "Hi";
		
		if((s1.length() > s2.length()) && (s1.length() > s2.length()))
		{
			System.out.println(s1.length());
		}
		else if((s2.length() > s1.length()) && (s2.length() > s3.length()))
		{
			System.out.println(s2.length());
		}
		else
		{
			System.out.println(s3.length());
		}
		
		for(int i = 0;i<s1.length();i++)
		{
			if(i < s1.length())
			{
				System.out.print(s1.charAt(i));
			}
			 if(i < s2.length())
			{
				System.out.print(s2.charAt(i));
			}
			if(i < s3.length())
			{
				System.out.print(s3.charAt(i));
			}
			System.out.println();
		}
	}

}
