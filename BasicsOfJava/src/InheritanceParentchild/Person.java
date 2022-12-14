package InheritanceParentchild;

public class Person {

	public int age;
	public String name,contact,gender;
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
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	void display()
	{
		System.out.println("Name: "+name+"\nAge:" +age +"\ncontact:"+contact +"\nGender:"+gender);
	}
}
