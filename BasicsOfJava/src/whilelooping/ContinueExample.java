package whilelooping;

public class ContinueExample {

	public static void main(String[] args) {
      
		int limit= 20,c=0;
		
		while(c<=limit)
		{
			c++;
			if(c % 3 == 0 )
			{
				continue;
			}
			System.out.println(c+" ");
		}
		
	}

}
