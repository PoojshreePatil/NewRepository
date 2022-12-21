package string;

public class ReverseArray {

	public static void main(String[] args) {

		String s = "Kanak";
		
		String rev = "";
		
		for(int i = s.length()-1;i>= 0;i--)
		{
			rev = rev + s.charAt(i);
		}
		System.out.println(rev);
		if(rev.equalsIgnoreCase(s))
		{
			System.out.println("Given String is Palindrome");
		}
		else
		{
			System.out.println("Given String is Not Palindrome");
		}
	}

}
