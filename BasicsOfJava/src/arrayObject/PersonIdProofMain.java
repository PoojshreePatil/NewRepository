package arrayObject;

import java.util.Scanner;

public class PersonIdProofMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Person p1[] = new Person[2];
		
		for(int i = 0;i < p1.length;i++)
		{
			/*
			 * System.out.println("Enter id,Name,Address:"); int pid = sc.nextInt(); String
			 * pnm = sc.next(); String paddress = sc.next();
			 * 
			 * Person p2 = new Person(); p2.setId(pid); p2.setName(pnm);
			 * p2.setAddress(paddress);
			 */
			
		    IdProof i1[] = new IdProof[2]; 
		    
		    	//System.out.println("Enter IdName ,Validity: ");
		    	for(int j = 0;j< i1.length;j++)
				{
		    		System.out.println("Enter IdName ,Validity: ");
			    	String inm = sc.next();
			    	int ivalidity = sc.nextInt();
			
				    IdProof i2 = new IdProof();
		            i2.setName(inm);
		            i2.setValidity(ivalidity);
				
		    	    i1[j] = i2;
		       }
		    	System.out.println("Enter id,Name,Address:");
				int pid = sc.nextInt();
				String pnm = sc.next();
				String paddress = sc.next();
			
				Person p2 = new Person();
				p2.setId(pid);
				p2.setName(pnm);
				p2.setAddress(paddress);
		    	p2.setIdp(i1);
		    	p1[i] = p2;
		}
	
		for(int i = 0;i< p1.length;i++)
		{
			Person pr = p1[i];
			
			IdProof i6[] =pr.getIdp();
			for(int j = 0;j<i6.length;j++)
			{
				IdProof i7 =i6[j];
				if(i7.getName().equalsIgnoreCase("Adhar"))
				 {
				   System.out.println(pr.getId()+"  " +pr.getName()+"   "+pr.getAddress()+" ");
				   System.out.println(i7.getName()+" "+i7.getValidity()+" ");
			     }
			}
		}
		/*
		 * for(Person pr:p1) { for(IdProof ip : pr.getIdp()) {
		 * if(ip.getName().equalsIgnoreCase("Adharcard")) {
		 * System.out.println("Person Info"+pr.getId() + " " + pr.getName() + " " +
		 * pr.getAddress() + " "+ip.getName()+" "+ip.getValidity());
		 * //System.out.println(p1); } } }
		 */
		
		
		
		
		
		
		
	}	
	}
		
		
		/*
		 * IdProof i1[] = new IdProof[2]; IdProof i2[] = new IdProof[2]; i1[0] = new
		 * IdProof("Adhar card ",2060); i1[1] = new IdProof("Pan card ",2050);
		 * 
		 * i2[0] = new IdProof("Adhar card ",2060); i2[1] = new
		 * IdProof("Pan card ",2050);
		 * 
		 * Person p1[] = new Person[2];
		 * 
		 * p1[0] = new Person(1,"Raj","Sangli",i1); p1[1] = new
		 * Person(1,"Raj","Sangli",i2);
		 */
		
	


