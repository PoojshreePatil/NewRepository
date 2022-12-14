package encapsulation;

public class Flight {

	private int id;
	private String source,company,destination,Class;
	private int ticketrate;
	
	public void setId(int id)
	{
		this.id = id;
	}
	public int getId()
	{
		return id;
	}
	
	public void setSource(String source)
	{
		this.source = source;
	}
	public String getSource()
	{
		return source;
	}
	
	public void setCompany(String company)
	{
		this.company = company;
	}
	public String getCompany()
	{
		return company;
	}
	
	public void setDestination(String destination)
	{
		this.destination = destination;
	}
	public String getDestination()
	{
		return destination;
	}
	
	public void setClass(String Class)
	{
		this.Class = Class;
	}
	public String getFClass()
	{
		return Class;
	}
	
	public void setTicketrate(int ticketrate)
	{
		this.ticketrate = ticketrate;
	}
	public int getTicketrate()
	{
		return ticketrate;
	}
	
	void display()
	{
		System.out.println("Id: "+id+"\nSource:"+source+"\ncompany:"+company+"\nDestination:"+destination+"\nClass: "+Class+"\nTicketrate:"+ticketrate);
	}
	public static void main(String[] args) {

		Flight f = new Flight();
		
		f.setId(1);
		f.setSource("pune");
		f.setCompany("indigo");
		f.setDestination("Sangli");
		f.setClass("Economiee");
		f.setTicketrate(5000);
		
		f.display();
		System.out.println(f.getId()+" "+f.getSource()+" "+f.getCompany()+" "+f.getDestination()+" "+f.getFClass()+" "+f.getTicketrate());
	}

}
