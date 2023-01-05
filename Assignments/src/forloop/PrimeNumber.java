package forloop;

public class PrimeNumber {

	public static void main(String[] args) {

		int sum =0,num;
		for (num = 400;num>=300;num--)
		{
			int i=2;
			int mid = num/2;
			while(i<= mid)
			{
				if(num  % i == 0)
				{
					break;
				}
				i++;
			}
			if(i> mid)
			{
				System.out.println(num);
				sum = sum +num;
			}
		}
		System.out.println("sum is:" +sum);
	}

}
