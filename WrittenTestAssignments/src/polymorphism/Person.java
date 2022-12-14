package polymorphism;
        
public class Person {

	private int age;
	private String name,gender;
	Address a;
	
	public Address getA() {
		return a;
	}
	public void setA(Address a)
	{
		this.a = a;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
	public String  toString()
	{
		return "Name:"+name+"\nAge:"+age+"\nGender:"+gender+"\nAddress\n"+a;
	}
}
