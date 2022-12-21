package string;

public class RemovewordOccurence {

	public static void main(String[] args) {

		String s = "abcbcacdabcbca";
		
		char ch[] = s.toCharArray();
		
		System.out.println(ch);
		
		String s1 ="bca";
		 char ch1[] = s.toCharArray();
		 
		 for(int i = 0;i< ch.length;i++)
		 {
			 //for(int j = 0;j< ch1.length;j++)
			 //{
				if((ch1[i] == 'b') && (ch1[i+1] == 'c') &&(ch1[i+2])=='a')
				//{
					 
		      // if(ch[i] == s1[i])
			// if((ch[i]==ch1[j]) && (ch[i+1] == ch1[j+1]) && (ch[i+2]==ch1[j+1]) )
			 {
				 i=i+2;
				// System.out.println(ch1);
				// continue;
			 }
			 else
			 {
				 s = s + ch[i];
			 }
      	}
			 System.out.println(s);
			 
   }
}
