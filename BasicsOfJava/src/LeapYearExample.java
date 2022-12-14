import java.util.Scanner;

public class LeapYearExample {

	public static void main(String[] args) {
		
		int num,year;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter year");
    	year = sc.nextInt();
		System.out.println("Enter your choice number:");
		num = sc.nextInt();
		
		switch(num)
		{
          case 1:
          case 3:  
          case 5:
          case 7:	  
          case 8:
          case 10:     
          case 12:
		     System.out.println("31 days");
		     break;
		     
          case 4:
          case 6:
		  case 9: 
          case 11:
		     System.out.println("30 days");
		     break;
		
          case 2:
        	  if((year % 4 ==0) || (year % 100 == 0) || (year % 400 == 0))
        	  {
        		System.out.println(year+ " is Leap year");
                System.out.println("29 days in this Month");
        	  }
        	  else
        	  {
        		  System.out.println(year+ " is not Leap year");
        		  System.out.println("28 days in this Month");
        	  }
 		     break;
 		     
		  default:
			  System.out.println("Enter valid number");
		}
		sc.close();
	}
	}


