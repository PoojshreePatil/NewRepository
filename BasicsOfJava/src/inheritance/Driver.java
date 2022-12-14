package inheritance;

public class Driver {
	
	private int id;
	private String name;
	private String contactno;
	
	public Driver(int id, String name, String contactno) 
	{
		this.id = id;
		this.name = name;
		this.contactno = contactno;
		
	}
	
	public String toString()
	{
		return "Id:"+id+"\nName:"+name+"\nContactno:"+contactno;
	}
	
}
