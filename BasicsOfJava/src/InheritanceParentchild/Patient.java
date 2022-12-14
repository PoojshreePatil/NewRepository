package InheritanceParentchild;

public class Patient extends Person {

	public int id,bedno;
	public String desease;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getBedno() {
		return bedno;
	}
	public void setBedno(int bedno) {
		this.bedno = bedno;
	}
	public String getDecease() {
		return desease;
	}
	public void setDcease(String desease) {
		this.desease = desease;
	}
	
	void display()
	{
		super.display();
		System.out.println("id: "+id +"\nBed no :" +bedno+ "\nDesease:"+desease);
	}
}
