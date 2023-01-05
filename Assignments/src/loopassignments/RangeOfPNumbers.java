package loopassignments;

public class RangeOfPNumbers {

	public static void main(String[] args) {

		int num = 100, rem = 0, rev = 0;
		// Scanner sc = new Scanner(System.in);
		 System.out.println("Palindrome numbers between 100 and 500 :");
		// num = sc.nextInt();
		int temp = num;
		while (num < 500)
		{
			rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
		}
			if (temp == rev)
			{
				System.out.println(temp);
			}
			num++;
		// sc.close();
	}
}
