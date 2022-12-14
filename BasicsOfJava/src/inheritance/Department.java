package inheritance;

public class Department {

	private int id;
	private String name;
	private int noofStudents;
	
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
	}
	
	public void setNoofStudents(int noofStudents)
	{
		this.noofStudents = noofStudents;
	}
	public int getNoofStudents()
	{
		return noofStudents;
	}
	
	public String toString()
	{
		return "Id:"+id+"\nName: "+name+"\nnoofStudents:"+noofStudents;
	}
}
