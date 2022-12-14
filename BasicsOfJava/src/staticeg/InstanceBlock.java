package staticeg;

public class InstanceBlock {

	int id ;
	String name,producer;
	{
		System.out.println("Instance Block 1");
		int id = 1;
		String name = "dsfsdf";
		String producer=" S S Rajamouli";
		
	}
	
	InstanceBlock()
	{
		System.out.println("Constructor 1");
		int id = 2;
		String name = "sdfd";
		String producer = "Chinmay Mandalekar";
		
	}
	void display()
	{
		System.out.println(id+" "+name+" "+ producer+" ");
	}
	
	public static void main(String[] args) {

		InstanceBlock i = new InstanceBlock();
		i.display();
	}

}
