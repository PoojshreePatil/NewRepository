package NumberPattern;

public class NumberPattern12 {
	
	public static void main(String[] args) {
		
	
		  int r =9;
			for(int i = 9;i>=1;i--)  //i=8
	      {
				for(int k = 1;k<=i;k++)  //9  8
	    	 {
	  		   System.out.print(" ");
	    	  }
	         for(int j = i;j<=r;j++)
	    	   {
	         	   System.out.print(j);
	    	   }
	    	   for(int m = r-1;m>=i;m--)
	    	   {
	    		   System.out.print(m);
	    	   }  
	    	   System.out.println();
	       }
	}

}
