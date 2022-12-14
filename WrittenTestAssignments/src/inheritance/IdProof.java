package inheritance;

public class IdProof extends Person {

	String name1,number,validity;

	
	public String getName1() {
		return name1;
	}

	public void setName1(String name1) {
		this.name1 = name1;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getValidity() {
		return validity;
	}

	public void setValidity(String validity) {
		this.validity = validity;
	}

	void display()
	{
		/*
		 * if(getIdProof().equalsIgnoreCase("Aadhar Card") &&
		 * getAddress().equalsIgnoreCase("pune")) { super.display();
		 * System.out.println("Name:"+name1+"\nNumber :"+number+"\nValidity:"+validity);
		 * } else { System.out.println("Enter valid data"); }
		 */
		
		  if( idProof == "Aadhar Card" && address == "Pune")
		  {
			  super.display();
		  System.out.println("Name:"+name1+"\nNumber :"+number+"\nValidity:"+validity);
		  } 
		  else 
		  { 
			  System.out.println("Enter valid data"); 
		  }
		 
}
}