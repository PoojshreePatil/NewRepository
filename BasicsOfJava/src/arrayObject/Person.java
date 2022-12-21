package arrayObject;

public class Person {

	private int  id;
	private String name,address;
	IdProof idp[];
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public IdProof[] getIdp() {
		return idp;
	}
	public void setIdp(IdProof idp[]) {
		this.idp = idp;
	}
	
	
	/*
	 * public Person(int id, String name, String address, IdProof idp) {
	 * 
	 * this.id = id; this.name = name; this.address = address; this.idp = idp; }
	 * 
	 */
	
	
	
}
