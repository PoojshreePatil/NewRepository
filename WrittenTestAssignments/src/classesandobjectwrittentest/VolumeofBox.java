package classesandobjectwrittentest;

public class VolumeofBox {

	void volume(int l,int w, int h)
	{
		int vol = l * w* h;
		System.out.println("Volume Of Box is: " +vol);
	}
	public static void main(String[] args) 
	{
		VolumeofBox v = new VolumeofBox();
		v.volume(8, 4, 6);
	}

}
