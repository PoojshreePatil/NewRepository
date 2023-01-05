package polymorphism;

public class BigKid extends Kid {

	void readBook()
	{
		System.out.println("read the book");
	}
	public static void main(String[] args) {

		BigKid k = new BigKid();
		k.readBook();
	}

}
