package loopassignments;

public class OddNumberUsingWhileLoop {

	public static void main(String[] args) {
      
		int i = 521;
		System.out.println("Odd numbers from 521 to 229:");
		while(i>=229)
		{
			if(i % 2 != 0)
			{
				System.out.print(i + " ");
			}
			i--;
		}
	}

}
