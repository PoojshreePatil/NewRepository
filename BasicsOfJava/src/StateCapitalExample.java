import java.util.Scanner;

public class StateCapitalExample {

	public static void main(String[] args) {
      String sname;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the state name:");
      sname = sc.nextLine();
      
      sname=sname.toLowerCase();
      
      switch(sname)
      {
        case "maharashtra":
    	     System.out.println("Capital is Mumbai");
    	     break;
    	
        case "karnataka":
   	     System.out.println("Capital is Bengluru");
   	     break;
   	     
        case "gujrat":
   	     System.out.println("Capital is Gandhinagar");
   	     break;
   	     
        case "rajasthan":
   	     System.out.println("Capital is jaipur");
   	     break;
   	     
        case "goa":
   	     System.out.println("Capital is panaji");
   	     break;
   	     
        case "madhya pradesh":
   	     System.out.println("Capital is Bhopal");
   	     break;
    	     
        case "andhra pradesh":
   	     System.out.println("Capital is Hyderabad");
   	     break;   
   	     
   	    default:
   	    	System.out.println("Enter a valid input");
      }
      sc.close();
	}

}
