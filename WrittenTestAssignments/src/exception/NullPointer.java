package exception;

public class NullPointer {


	void nullValue()
	{
		String a[] = {"1", null};
		String s = null;
        try
        {
        	for(int i = 0;i<a.length;i++)
        	{
             if(s.charAt(i) == 'a')
             {
            	 System.out.println(s);
             }
             if(a[i].equals("a"))
             {
            	 System.out.println(a);
             }
        	}	
        }
        catch(NullPointerException n)
        {
         	 n.printStackTrace();
        }
	}

	public static void main(String[] args)
	{

		NullPointer n = new NullPointer();
		NullPointer n1 = null;
		n.toString();
		n1.nullValue();
		
	}
}

