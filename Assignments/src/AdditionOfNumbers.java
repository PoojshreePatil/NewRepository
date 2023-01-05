
public class AdditionOfNumbers {

	public static void main(String[] args) {

		int i =1,limit = 5,sum = 0,product =1,sum1=0;
		while(i <= limit)
		{
			if( i % 2 == 0)
			{
				sum = sum + 1;
			}
			else
			{
				sum1 = sum1 + 1;
			}
			i++;
		}
		System.out.println("Addition Of Even Number: " + sum);
		System.out.println("Addition Of Odd Numbers: "+ sum1);
		
		i = 1;
		while(i<= limit)
		{
			product = product*i;
			i++;
			
		}
		System.out.println("Product is:" +product);
	}

}
