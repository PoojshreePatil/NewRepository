package inheritance;

public class Person {

	int id;
	String name,emailId,contact;
	Address a;
	
	public Person(int id, String name, String emailId, String contact, Address a)
	{
		
		this.id = id;
		this.name = name;
		this.emailId = emailId;
		this.contact = contact;
		this.a = a;
	}
	
	public String toString()
	{
		return "Id:"+id+"\nName:"+name+"\nEmailId:"+emailId+"\ncontact:"+contact+"\nAddress"+a;
	}
}
