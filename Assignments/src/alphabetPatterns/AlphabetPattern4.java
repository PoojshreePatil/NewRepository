package alphabetPatterns;

public class AlphabetPattern4 {

	public static void main(String[] args) {

		for(char ch = 'a'; ch<='e';ch++)
		{
			for(char j = 'e'; j>=ch;j--)
			{
				System.out.print(j);
			}
			
			System.out.println();
		
		}
	}

}



