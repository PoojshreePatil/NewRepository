package string;

public class AlphabateOrder {

	public static void main(String[] args) {

		String s = "The quick brown fox jumps over the lazy dog";
	
		char ch[]= s.toCharArray();
		for(int i = 0;i< ch.length;i++)
		{
			if(ch[i] >='A' && ch[i]<='Z')
			{
			    int ch1 = (ch[i] - 64);
			   System.out.print(ch[i]+":"+ch1+" ");
			}
			else if(ch[i] >='a' && ch[i]<='z')
			{
				int ch2 = (ch[i] - 96);
				   System.out.print(ch[i]+":"+ch2+" ");
			}
		}
	  
	}

}
