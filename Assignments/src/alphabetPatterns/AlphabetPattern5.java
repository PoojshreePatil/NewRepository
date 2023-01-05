package alphabetPatterns;

public class AlphabetPattern5 {

	public static void main(String[] args) {

		for(char i ='e';i>='a';i--)
		{
			for(char j = 'e';j>=i;j--)
			{
				System.out.print(j);
			}
			System.out.println();	
		}
	
	}

}


/*
 * //char ch ='e'; for(int i = 1; i<=5;i++) { for(int j = 1; j<=i;j++) {
 * System.out.print(ch); //ch--; }
 * 
 * System.out.println(); //ch = 'e';
 * 
 * } }
 */