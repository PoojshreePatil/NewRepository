package forloop;

public class PalinDromNumbers {

	public static void main(String[] args) {

		for(int num = 1 ; num<=100 ; num++)
		{
			int temp =num;
			int rem,rev = 0;
		    while(temp != 0)
		    {
		    	rem = temp % 10;
		    	rev = rev * 10+ rem;
		    	temp = temp / 10;
		    }
		    if(rev == num)
		    {
		    	System.out.println(rev);
		    }	
	}

	}
}
