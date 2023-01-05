import java.util.Scanner;

public class PrimeNumberUsingBoolean {

	public static void main(String[] args) {

		int num,i=2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		num = sc.nextInt();
		
		boolean flag=true;
		 while(i<num)
		 {
			 if(num% i==0)
			 {
				 flag=false;
				 break;
			 }
			 i++;
		 }
		 if(flag==false)
		 {
			 System.out.println(" Not Prime Number");
		 }
		 else
		 {
			 System.out.println("Prime Number");
		 }
		 sc.close();
	}

}
