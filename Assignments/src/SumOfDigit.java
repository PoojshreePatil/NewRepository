import java.util.Scanner;

public class SumOfDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int num,rem,sum=0;
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter any number:");
          num = sc.nextInt();
           while(num>0)
           {
        	   rem = num % 10;
        	   sum = sum + rem;
        	   num = num / 10;
           }
           System.out.println("Sum of Digit is: " +sum);
           sc.close();    
	}

}
