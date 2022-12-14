package classesandobjectwrittentest;

public class Box {

	int length,width,height;
	
	void calculateVolume(int l,int w,int h)
	{
		length = l;
		width = w;
		height = h;
		 
		int volume = l* w* h;
		System.out.println("Volume Of Box is:"+volume);
	}
	public static void main(String[] args) {

		Box b = new Box();
		b.calculateVolume(8, 4, 6);
	}

}
