package NumberPattern;
import java.util.Scanner;
public class NumberPattern14 {

	public static void main(String[] args) {
	
				int row;
				Scanner sc = new Scanner(System.in);
				System.out.println("enter row no");
				row = sc.nextInt();
				for (int i = 1; i <= row; i++) 
				{
					int num;
					if(i%2==0) 
					{
						num=0;
						System.out.print(num);
					}else {
						num=1;
					System.out.print(num);
					}
					
					for(int j=1;j<5;j++)
					{
						if(num==1)
						{
							num=0;
						}else {
							num=1;
						}
						System.out.print(num);
					}
					System.out.println("");
				}
				sc.close();
				
			}
		}
	

