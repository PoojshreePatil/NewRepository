package inheritance;

public class Father extends GrandFather {

	private String fn1;
	
	public String getFn1() {
		return fn1;
	}
	public void setFn1(String fn1) {
		this.fn1 = fn1;
	}
	void display()
	{
		super.display();
			System.out.println("Full name:"+fn1+" "+super.getFn()+" "+ln);
	}
}
