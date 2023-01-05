package NumberPattern;

public class NumberPattern13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i =1;i<=5;i++)
		{
			 int num;
			if(i%2 == 0)          //1
			{
				num = 0;
				System.out.print(num);
			}
			/*
			 * else if(j % 2 != 0) { System.out.print(0); } else if(j % 2== 0) {
			 * System.out.print(1); }
			 */
			else 
			{
				System.out.print(num=1);
			}
			/*
			 * else { break; }
			 */
			//System.out.println();
		
			/*
			 * for(int j = 1;j<=i;j++) { if(j % 2 == 0) { System.out.print(1); } else {
			 * System.out.print(0); }
			 */
						
		  for(int j = 1;j<=5;j++)
		 {
			  if(num == 1)          //1
				{
					System.out.print(0);
				}
			  else 
				{
					System.out.print(1);
				}

		}
			System.out.println();
	}

}}
