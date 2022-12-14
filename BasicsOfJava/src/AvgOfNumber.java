import java.util.Scanner;
public class AvgOfNumber {

	public static void main(String[] args) {
		
		int n1,n2,n3,n4,n5 ,avg;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 5 Numbers:");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		n3 = sc.nextInt();
		n4 = sc.nextInt();
		n5 = sc.nextInt();
		
		avg = (n1+n2+n3+n4+n5)/5;
		System.out.println("Avearage of 5 Numbers is:" +avg);
		sc.close();

	}

}
