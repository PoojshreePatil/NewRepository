package alphabetPatterns;

public class AlphabetPattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		int r =5;
		for(char i ='A'; i<='F';i++)
		{
			//for(char k='A';k<=r-i;k++)
			//{
				//System.out.println(" ");
			//}
			for (char j ='A';j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}

