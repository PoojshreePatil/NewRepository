package inheritance;

public class DynamicMethodDispatch {

	public static void main(String[] args) {

		Fruit f = new Fruit();
		f.taste();
		
		f = new Apple();
		f.taste();
		
		f = new Mango();
		f.taste();
		
	}

}
