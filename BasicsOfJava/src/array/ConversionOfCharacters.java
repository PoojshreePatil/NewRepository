package array;

public class ConversionOfCharacters {

	void arrayElements(char a[])
	{
		System.out.println("Elements of Array:");
		for(char i = 0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	void ConversionOfCharacter(char a[])
	{
		System.out.println("New Array Elements:");
		for(char i = 0;i<a.length;i++)
		{
			if(a[i] >= 'a' && a[i] <= 'z')
			{
			   a[i] = ((char )(a[i]-32));
		    }
			else if(a[i] >= 'A' && a[i] <= 'Z')
			{
			   a[i] = ((char )(a[i]+32));
		    }
			System.out.print(a[i]+" ");
		}
		
	}
	public static void main(String[] args) {

		char arr[]= { 'A','b','C','d','E','f','G','h','I'};
		ConversionOfCharacters c = new ConversionOfCharacters();
		c.arrayElements(arr);
		c.ConversionOfCharacter(arr);
	}

}
