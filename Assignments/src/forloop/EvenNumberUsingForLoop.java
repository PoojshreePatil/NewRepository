package forloop;

public class EvenNumberUsingForLoop {

	public static void main(String[] args) {
      
		int i=121;
		System.out.println("Even numbers from 121 to 229:");
		for(i=121; i<=229;i++)
		{
			if(i % 2 == 0)
			{
				System.out.println(i);
			}
		}
	}

}
