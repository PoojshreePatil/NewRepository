package InheritanceParentchild;

public class PersondoctorPatientMain {

	public static void main(String[] args) {

		
		Doctor d = new Doctor();
		d.setAge(50);
		d.setName("Dr. Patil" );
		d.setContact("575647887");
		d.setGender("Female");
		d.setId(1);
		d.setLicno(8976756);
	    d.setSpecialization("Cancer Specialist");
	    d.display();
	 //   System.out.println(d);
	    
	    Patient p = new Patient ();
	    p.setAge(55);
		p.setName("sonali" );
		p.setContact("724757677");
		p.setGender("Female");
	    p.setId(2);
	    p.setBedno(5);
	    p.setDcease("Blood cancer");
	    p.display();
	  // System.out.println();
	}

}
