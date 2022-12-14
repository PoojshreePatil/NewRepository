package inheritance;

public class Person {

	int id,contact;
	String name,address,idProof;
	
	public String getIdProof() {
		return idProof;
	}
	public void setIdProof(String idProof) {
		this.idProof = idProof;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getContact() {
		return contact;
	}
	public void setContact(int contact) {
		this.contact = contact;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	void display()
	{
		System.out.println("Id:"+id+"\nName:"+name+"\nContact:"+contact+"\nAddress:"+address+"\nId Proof:"+idProof);
	}	
}
