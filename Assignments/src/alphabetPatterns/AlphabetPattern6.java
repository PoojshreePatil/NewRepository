package alphabetPatterns;

public class AlphabetPattern6 {

	public static void main(String[] args) {

		for(char i = 'a';i<='d';i++)
		{
			for(char k = 'a';k>=i;k++)
			{
				System.out.print(" ");
			}
			for(char j = 'a';j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
