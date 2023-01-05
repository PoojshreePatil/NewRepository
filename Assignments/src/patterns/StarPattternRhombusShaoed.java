package patterns;

public class StarPattternRhombusShaoed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int r = 4;
		for (int i = 1; i <= 4; i++)
		{
			for (int k = 1; k <= r - i; k++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		 for(int i=3;i>=1;i--)
		 { 
			 for(int k=1;k<=r-i;k++) 
			 { System.out.print(" "); 
			 }
		 for(int j= 1;j<=i;j++ ) 
		 { 
			 
			 System.out.print("* ");
		 } 
		 System.out.println();
		 }
		 
	}

}
