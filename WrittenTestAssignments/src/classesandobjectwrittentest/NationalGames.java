package classesandobjectwrittentest;

import java.util.Scanner;

public class NationalGames {

	void games()
	{
		String countryname;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the country Name:");
		countryname = sc.nextLine();
		countryname = countryname.toLowerCase();
		
		switch(countryname)
		{
		   case "india":
		    System.out.println("National Game is Hockey ");
		    break;
		    
		   case "china":
			  System.out.println("National Game is Table Tennis ");
			   break;  
		  
		   case "bangladesh":
				  System.out.println("National Game is Kabaddi ");
				   break;  
				   
		   case "italy":
				  System.out.println("National Game is Football ");
				   break;  
			   
		   case "united states":
				  System.out.println("National Game is Baseball ");
				   break;  
				   
		  default:
			  System.out.println("Enter valid country Name");
				   
		}
	}
	
	public static void main(String[] args) 
	{
		NationalGames n = new NationalGames();
		n.games();
	}

}
