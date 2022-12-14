import java.util.Scanner;
public class SmallestNumber {

	public static void main(String[] args) {
    
		int a,b,c,d;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter four Numbers: ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		
		if((a<b) && (a<c) && (a<d))
		{
			System.out.println("Smallest Number is: " +a);
		}
		else if((b<a) && (b<c) && (b<d))
		{
			System.out.println("Smallest Number is :" +b);
		}
		else if((c<a) && (c<b) && (c<d))
		{
			System.out.println("Smallest Number is :" +c);
		}
		else
		{
			System.out.println("Smallest Number is: " +d);
		}
		sc.close();
	}
}

