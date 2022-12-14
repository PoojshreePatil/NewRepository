package writtenloops;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {

		for (int num = 400;num>=200;num--)
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
			}
		}
	}

}
