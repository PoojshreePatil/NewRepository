package thiskeywordExamples;

public class Student {

      int id;
      String name;
	

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


	public static void main(String[] args) {

		Student s1 = new Student();
		s1.setId(11);
		System.out.println("Id:"+ s1.getId());
		Student s2 = new Student();
		s2.setId(21);
		System.out.println("Id:"+ s2.getId());
	}

}
