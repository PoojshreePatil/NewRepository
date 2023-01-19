package treeMap;

public class Person implements Comparable<Person>
  {
	int id;
	String name,email,address;
	public Person(int id, String name, String email, String address) {
	
		this.id = id;
		this.name = name;
		this.email = email;
		this.address = address;
	}
	@Override
	public String toString() {
		return "\nPerson [id=" + id + ", name=" + name + ", email=" + email + ", address=" + address + "]";
	}

	public int compareTo(Person p)
	{
		return this.id - p.id;
		
	}
	
}
