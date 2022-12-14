package inheritance;

import java.util.Scanner;

public class PersonIdproofMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		IdProof i = new IdProof();
		 int id = sc.nextInt();
		 int contact = sc.nextInt();
		 sc.next();
		 String name = sc.next();
		 String address = sc.next();
		 
		 System.out.println("Id Proof:");
		 sc.next();
		 String idProof = sc.next();
		 String name1 = sc.next();
		 String number = sc.next();
		 String validity = sc.next();
		//i.display();
		
		 i.setId(id);
		 i.setName(name); 
		 i.setAddress(address);
		  i.setContact(contact);
		 i.setIdProof(idProof);
		 i.setName1(name1);
		 i.setNumber(number);
		 i.setValidity(validity);
		 i.display();
		 
		/*
		 * i.setId(1); i.setName("Poojshree"); i.setAddress("Pune");
		 * i.setContact(934789878); i.setIdProof("Aadhar Card");
		 * i.setName1("Poojshree Patil"); i.setNumber("481079734185");
		 * i.setValidity("2/40"); i.display();
		 */
		
	}

}
