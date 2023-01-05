package assignment7;

public class Q12 {

	//2.What is use of variable arguments show with example?
	int sum = 0;
	void add(int ...a)
	{
		for(int i = 0; i<a.length;i++)
		{
		    sum = sum + a[i];
		}
		System.out.println(sum);
	}
	public static void main(String[] args) {

		Q12 q = new Q12();
		q.add(10,20,30);
	}

}
