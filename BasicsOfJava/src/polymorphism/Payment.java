package polymorphism;

public class Payment{

	void payment(int googlepay )
	{
		System.out.println("This is payment via googlepay ");
	}
	void payment(float paytm )
	{
		System.out.println("This is payment via paytm ");
	}
	void payment(long phonepay )
	{
		System.out.println("This is payment via phonepay ");
	}
	
	public static void main(String[] args)
	{
		Payment p = new Payment();
		p.payment(100);
		p.payment(50.5f);
		p.payment(2355l);
		
	}
}
