package alphabetPatterns;

public class AlphabetPattern {

	public static void main(String[] args) {

		for(char i ='a'; i <='d';i++)
		{
			for(char j='a'; j<=i;j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
	}

}