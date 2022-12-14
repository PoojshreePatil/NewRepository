package inheritance;

public class Engine {

	int cylinder,torque;
	String company,power;
	
	public void setCylinder(int cylinder)
	{
		this.cylinder = cylinder;
	}
	public int getCylinder() 
	{
		return cylinder;
	}
	
	public void setTorque(int torque)
	{
		this.torque = torque;
	}
	public int getTorque()
	{
		return torque;
	}
	
	public void setCompany(String company)
	{
		this.company = company;
	}
	public String getCompany() 
	{
		return company;
	}
	
	public void setPower(String power) 
	{
		this.power = power;
	}
	public String getPower()
	{
		return power;
	}
	
	
	public String toString()
	{
		return "Cylinder:"+cylinder+"\nTorque:"+torque+"\nCompany:"+company+"\nPower:"+power;
	}
}
