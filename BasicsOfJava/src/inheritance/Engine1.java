package inheritance;

public class Engine1 {

	int cylinder,torque;
	String company,power;
	Engine1(int cylinder, int torque, String company, String power)
	{
		this.cylinder = cylinder;
		this.torque = torque;
		this.company = company;
		this.power = power;
	}
	
	public String toString()
	{
		return "Cylinder:"+cylinder+"\nTorque:"+torque+"\nCompany:"+company+"\nPower:"+power;
	}
}
