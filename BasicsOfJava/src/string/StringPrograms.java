package string;

public class StringPrograms {

	public static void main(String[] args) {

		String s = "Java Language";
		char ch = 'a';
		int cnt =0;
		for(int i = 0;i< s.length();i++)
		{
			if(s.charAt(i)=='a')
			{
				cnt++;
			}
		}
		System.out.println(ch+" is "+cnt+" times in String");
		
		int cnt1 =0;
		char ch1[] = s.toCharArray();
		for(int i = 0;i< s.length();i++)
		{
			if(ch1[i]=='a')
			{
				cnt1++;
			}
		}
		System.out.println(ch+" is "+cnt+" times in Array");
		
		
		for(int i = 0;i< s.length();i++)
		{
			if(ch1[i]=='a')
			{
				ch1[i] ='A';
			//	System.out.println(ch1[i]);
			}
		}
		
		String s1 = new String(ch1);
		System.out.println(s1);
		
	}

}
