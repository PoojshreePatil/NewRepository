package string;

public class CountAlphadigspecChar {

	public static void main(String[] args) {

		String s = "jgsJdkPe@)1WE$&234il*l!";
		
		char ch1 [] =s.toCharArray();
		int alpha = 0;
		int digi =0;
		int schar = 0;
		for(int i = 0;i< ch1.length;i++)
		{
			if(ch1[i] >= 65 && ch1[i] <= 122)
			{
				alpha ++;
			}
			else if(ch1[i] >= 48 && ch1[i] <= 57)
			{
				digi ++;
			}
			else
			{
				schar++;
			}
		}
		System.out.println("Number of Alphabates in String: "+alpha);
		System.out.println("Number Of Digits in String:" +digi);
		System.out.println("Number Of Special Characters in String:" +schar);
	}

}
