package alphabetPatterns;

public class Ap1 {

	public static void main(String[] args) {

		  for(char ch='e';ch>='a';ch--) {
			  for(char ch1='e';ch1>ch;ch1--)
			  {
				  System.out.print(" ");
			  }
			  for(char ch2='a';ch2<=ch;ch2++)
			  {
				  System.out.print(ch2+" ");  
			  }
			  System.out.println();
		}
	}

}
