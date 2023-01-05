package assignment3;

public class Student10 {
/*
	10.Create a class Student with 4 variables called as rollNo, admissionNo, age, 
	courseId.Each of the variables should have one of the access modifier -
	public, protected, no-access-modifier and private.Add 4 methods in the 
	class – public, method doPublic, no access modifier method doDefault, 
	protected method doProtected, private method doPrivate.
	a. In main method outside the class but in same package – create object of 
	type Student.
	b. Try to access rollno outside the class.
	c. Try to access age outside the package.
	d. Also try to access private methods outside the class and protected 
	methods outside the package
*/
	
	public int rollno;
	protected int admissionno;
	int age;
	//private int courseId;
	
	
	public void doPublic()
	{
		System.out.println("This is public method ");
	}
	
	void doDefault()
	{
		System.out.println("This is default method ");
	}
	
	protected void doProtected()
	{
		System.out.println("This is protected method ");
	}
	/*
	 * private void doPrivate() { System.out.println("This is private method "); }
	 * 
	 */
}
