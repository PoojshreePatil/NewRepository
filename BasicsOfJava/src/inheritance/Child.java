package inheritance;

public class Child extends Father {

private String fn2;
	
	public String getFn2() {
		return fn2;
	}
	public void setFn2(String fn2) {
		this.fn2 = fn2;
	}
	void display()
	{
		     super.display();
			System.out.println("Full name:"+fn2+" "+super.getFn1()+" "+ln);
	}
}
