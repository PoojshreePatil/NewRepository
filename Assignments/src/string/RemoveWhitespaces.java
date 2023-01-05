package string;

public class RemoveWhitespaces {

	public static void main(String[] args) {

		String s = " Java is a Programming language ";
		
		char ch[] = s.toCharArray();
		
		for(int i =0;i< s.length();i++)
		{
			if(ch[i] == ' ')
			{
				continue;
			}
			System.out.print(ch[i]);
		}
		
		System.out.println(s.replaceAll("\\s+", ""));
	}

}
