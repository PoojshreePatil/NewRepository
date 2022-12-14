package polymorphism;

public class PersonAddressMain {

	public static void main(String[] args) {

		Address a = new Address();
		a.setCity("Irali");
		a.setState("Maharashtra");
		a.setCountry("India");
		
		Person p = new Person();
		p.setName("Poojshree");
		p.setAge(20);
		p.setGender("Female");
		p.setA(a);
		System.out.println(p);
	}

}
