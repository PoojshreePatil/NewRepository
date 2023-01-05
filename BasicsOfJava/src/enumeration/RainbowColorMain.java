package enumeration;

public class RainbowColorMain {

public static void main(String[] args) {
		
		RainbowColor rc1 = RainbowColor.RED;
		
		System.out.println(rc1.ordinal()); // position in the list constants 
		
		RainbowColor rbc[]= RainbowColor.values();
		
		for(RainbowColor rc:rbc)
		{
			System.out.println(rc.ordinal()+" "+rc);
			rc.display();   // display the it is the rainbow color 
		}

	}

}
