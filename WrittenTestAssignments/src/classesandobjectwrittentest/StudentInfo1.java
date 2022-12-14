package classesandobjectwrittentest;

public class StudentInfo1 {

	
	void accept( int id,String sname,int s1,int s2,int s3)
	{
		System.out.println("Accept the Information");
		System.out.println("Student id :"+id);
		System.out.println("Student Name: "+sname);
		System.out.println("Marks of 3 Subjects ");
		System.out.println("Marathi: "+s1);
		System.out.println("Hindi: "+s2);
		System.out.println("English: "+s3);
		
	}
	void calculate(int s1, int s2, int s3)
	{
		int percentage = (s1+s2+s3)/3;
		System.out.println("Percentage is :"+percentage);
	}
	
	
	public static void main(String[] args) {

		StudentInfo1 s = new StudentInfo1();
		s.accept(1, null, 88, 90, 88);
		s.calculate(88, 90, 88);
		
	}

}
