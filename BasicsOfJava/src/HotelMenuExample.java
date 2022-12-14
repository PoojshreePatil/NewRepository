/*import java.util.Scanner;

public class HotelMenuExample {

	public static void main(String[] args) {
      
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Choice");
		num = sc.nextInt();
		
		switch(num)
		{
		  case 1:
			System.out.println("Maharashtrian Thali----------- Price-250/-");
			System.out.println("Enter Quantity:");
			int quantity =sc.nextInt();
			int total;
			if(quantity >0)
			{
				total= quantity * 240;
				System.out.println("Total Bill is :" +total);
			}
			break;
			
		  case 2:
			System.out.println("Punjabi Thali----------- Price-250/-");
			System.out.println("Enter Quantity:");
			int quantity2 =sc.nextInt();
			int total2;
			if(quantity2 >0)
			{
				total2= quantity2 * 180;
				System.out.println("Total Bill is :" +total2);
			}
			break;
			
	      case 3:
			System.out.println("Rajasthani Thali----------- Price-250/-");
			System.out.println("Enter Quantity:");
			int quantity3 =sc.nextInt();
			int total3;
			if(quantity3 >0)
			{
				total3= quantity3 * 250;
				System.out.println("Total Bill is :" +total3);
			}
			break;
			
		  case 4:
			System.out.println("South Indian Thali----------- Price-250/-");
			System.out.println("Enter Quantity:");
			int quantity4 =sc.nextInt();
			int total4;
			if(quantity4 >0)
			{
				total4= quantity4 * 170;
				System.out.println("Total Bill is :" +total4);
			}
			break;
		 default:
			System.out.println("Enter valid Number");
		}
		sc.close();
	}

} 


*/


import java.util.Scanner;

public class HotelMenuExample {

	public static void main(String[] args) {
      
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Choice");
		num = sc.nextInt();
		System.out.println("Enter Quantity:");
		int quantity =sc.nextInt();
		int total;
		
		switch(num)
		{
	     	case 1:
			   System.out.println("Maharashtrian Thali----------- Price-250/-");
		   	   if(quantity >0)
			    {
			    	total= quantity * 240;
			    	System.out.println("Total Bill is :" +total);
			    } 
			   break;
			
	    	case 2:
			   System.out.println("Punjabi Thali----------- Price-250/-");
			   if(quantity >0)
			   {
			    	total= quantity * 180;
			    	System.out.println("Total Bill is :" +total);
			   }
			  break;
		 	
		    case 3:
		    	System.out.println("Rajasthani Thali----------- Price-250/-");
		     	if(quantity >0)
		    	{
			    	total= quantity * 250;
			    	System.out.println("Total Bill is :" +total);
			    }
			   break;
			
		    case 4:
		    	System.out.println("South Indian Thali----------- Price-250/-");
		    	if(quantity>0)
		     	{
			    	total= quantity * 170;
			    	System.out.println("Total Bill is :" +total);
			}
			break;
		default:
			System.out.println("Enter valid Number");
		}
		sc.close();
	}

}







