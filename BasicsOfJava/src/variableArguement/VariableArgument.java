package variableArguement;

public class VariableArgument {

	void add(int... a)
	{
		int sum = 0;
		for(int i = 0;i< a.length;i++)
		{
			sum = sum + a[i];
			
		}
		System.out.println(sum);
	}
	void avg(float ...marks)
	{
		float sum = 0;
		for(int i = 0;i< marks.length;i++)
		{
			sum = sum + marks[i];
		}
		System.out.println("Average = "+(sum / marks.length));
	}
	public static void main(String[] args) {

		VariableArgument v = new VariableArgument();
		v.add(12 ,13 ,14,15);
		v.avg(20.5f,60.4f,100.5f);
	}

}
