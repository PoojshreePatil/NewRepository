package inheritance;

public class LaptopMain {

	public static void main(String[] args) {

		Laptop l = new Laptop();
		l.setNoOfUSBPort(4);
		l.setProcessorSpeed(789);
		
		System.out.println("No of USB Ports: "+l.getNoOfUSBPort()+"  Processor Speed: "+l.getProcessorSpeed()+"GHz"); 
		
	}

}
