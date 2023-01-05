package NumberPattern;

public class Np1 {

	public static void main(String[] args) {

		int x = 0;
		  for(int i=1;i<=4;i++)
		  {
		    	for(int j=1;j<=x+i;j++) 
		    	{
		    		System.out.print(j);
		    	}
		    	System.out.println();
		    	x=x+1;
		    }
			
	}

}

//for(int i=1;i<=4;i++) {
	//for(int j=1;j<2*i;j++) {
	//	System.out.print(j);
//	}
	//System.out.println();
//}

