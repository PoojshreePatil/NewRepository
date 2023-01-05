import java.util.Scanner;

public class PrimeNumberUsingMid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int num,i=2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        num = sc.nextInt();
        
        int mid=num/2;
        
        while(i<=mid)
        {
        	if(num % i ==0)
        	{
        		break;
        	}
        	i++;
        }
        if(i>mid)
        {
        	System.out.println("Prime Number");
        }
        else
        {
        	System.out.println("Not Prime Number");
        }
       
      sc.close();
	}

}
