package classesandobject;

public class Percentage {

	int total(int s1,int s2, int s3)
	{
		int total = s1 + s2 + s3;
		System.out.println("Total is:"+total);
		return total;	
	}
	void percentage(int total)
	{
		float percent = total / 3;
		System.out.println("Percentage :"+percent+" %");
	}
	
	public static void main(String[] args) {

		Percentage p = new Percentage();
		int tot =p.total(80,90, 88);
		p.percentage(tot);
	}

}
