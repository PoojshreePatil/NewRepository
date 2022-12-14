import java.util.Scanner;
public class DivisibleNumber {

	public static void main(String[] args) {

		int num;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a Number");
		num = sc.nextInt();
		
		if(num % 3 == 0)
		{
			System.out.println(num + " is Divisible by 3");
		}
		else 
		{
			System.out.println(num + " is not  Divisible by 3");
		}
		sc.close();
	}

}
