package inheritance;

public class CollegeMain {

	public static void main(String[] args) {

		
		Department d = new Department();
		d.setId(1);
		d.setName("Computer");
		d.setNoofStudents(200);
		
		Library l = new Library();
		l.setIncharge("Mr.Patil");
		l.setNoofBooks(400);
		
		College c = new College();
		c.setAddress("pune");
		c.setName("KWC");
		c.setCode(6576);
		c.setDept(d);
		c.setLib(l);
		
		System.out.println(c);
	}

}
