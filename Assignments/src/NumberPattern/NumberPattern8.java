package NumberPattern;

public class NumberPattern8 {

	public static void main(String[] args) {
		//TODO Auto-generated method stub
       int r =7;
		for(int i = 1;i<=7;i++)
       {
    	   for(int k = 1;k<=r-i;k++)
    	   {
    		   System.out.print(" ");
    	   }
    	   
    	   for(int j =1;j<=i;j++)
    	   {
    		   System.out.print(i+" ");
    	   }
    	   System.out.println();
       }
	}

}
