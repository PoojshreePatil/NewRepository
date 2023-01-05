package alphabetPatterns;

public class AlphabetPattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(char i ='A';i<='F';i++)
		{
			for(char j = 'F';j>=i;j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
