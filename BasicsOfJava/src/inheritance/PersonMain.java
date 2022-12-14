package inheritance;

public class PersonMain {

	public static void main(String[] args) {

		Address a = new Address("Katraj","Pune","Maharashtra",400012);
		
		Person p = new Person(1,"Poojshree","pspatil@gmail.com","9112995105",a);
		
		System.out.println(p);
		
		System.out.println("****************************");
		Address a1 = new Address("KarveNagar","Pune","Maharashtra",400012);
		Person p1 = new Person(2,"Yash","yspatil@gmail.com","9112989927",a1);
		System.out.println(p1);
		
		System.out.println("****************************");
		Address a2 = new Address("Kotharud","Pune","Maharashtra",400012);
		Person p2 = new Person(3,"Raj","rspatil@gmail.com","9876543210",a2);
		System.out.println(p2);
	}

}
