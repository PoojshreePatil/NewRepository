package NumberPattern;

public class NumberPattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int r=5;
       for(int i = 5;i>=1;i--)
       {
    	   for(int k =1;k<=r-i;k++)
    	   {
    		   System.out.print(" ");
    	   }
    	   for(int j=1;j<=i;j++)
    	   {
    		   System.out.print(j+" ");
    	   }
    	   System.out.println();
       }
       for(int i = 2;i<=5;i++)
       {
    	   for(int k =1;k<=r-i;k++)
    	   {
    		   System.out.print(" ");
    	   }
    	   for(int j=1;j<=i;j++)
    	   {
    		   System.out.print(j+" ");
    	   }
    	   System.out.println();
       }
	}

}
