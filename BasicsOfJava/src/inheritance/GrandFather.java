package inheritance;

public class GrandFather {

	private String fn,mn;
	static String ln = "Patil";
	public String getFn() {
		return fn;
	}
	public void setFn(String fn) {
		this.fn = fn;
	}
	public String getMn() {
		return mn;
	}
	public void setMn(String mn) {
		this.mn = mn;
	}
	
	void display()
	{
		System.out.println("Full name:"+fn+" "+mn+" "+GrandFather.ln);
	}
	
}
