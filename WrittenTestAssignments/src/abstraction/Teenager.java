package abstraction;

public class Teenager extends Kid{

  void readBook()
  {
	  System.out.println("Read the Nowels");
  }
  
  public static void main(String[] args) {
	
	  Kid k1 = new BigKid();
	  k1.readBook();
	  k1.readBook("The Great Warrior Sambhaji", "Vishwas patil");
	  Kid k2 = new Teenager();
	  k2.readBook();
}
}
