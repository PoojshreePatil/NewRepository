package InheritanceParentchild;

public class Doctor extends Person {

	public int id,licno;
	public String specialization;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getLicno() {
		return licno;
	}
	public void setLicno(int licno) {
		this.licno = licno;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	void display()
	{
		super.display();
		System.out.println("id: "+id +"\nlic no :" +licno+ "\nSpecialization:"+specialization);
	}
	
}
