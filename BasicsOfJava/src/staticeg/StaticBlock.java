package staticeg;

public class StaticBlock {

	int a;
	static int count;
	
	static
	{
	  count++;
	  System.out.println("Static block1:");
	}
	static
	{
	  count++;
	  System.out.println("Static block2:");
	}
	public static void main(String[] args) {

		System.out.println(StaticBlock.count);
	}

}
