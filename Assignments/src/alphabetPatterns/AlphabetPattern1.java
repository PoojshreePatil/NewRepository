package alphabetPatterns;

public class AlphabetPattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		for(char i ='F';i>='A';i-- )
		{
			for(char j='A';j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		/*
		 * for(char i ='A';i<='F';i++) { for(char j = 'A';j<=i;j++) {
		 * System.out.print(j+" "); } System.out.println(); }
		 */
	}

}
