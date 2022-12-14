package inheritance;

public class Library {

	private int noofBooks;
	private String incharge;
	
	public void setNoofBooks(int noofBooks)
	{
		this.noofBooks = noofBooks;
	}
	public int getNoofBooks()
	{
		return noofBooks;
	}
	
	public void setIncharge(String incharge)
	{
		this.incharge = incharge;
	}
	public String getIncharge()
	{
		return incharge;
	}
	
	public String toString()
	{
		return "NoOfBooks:"+ noofBooks+"\nIncharge Name:"+incharge;
	}
	
	
}
