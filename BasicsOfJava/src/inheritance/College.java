package inheritance;

public class College {

	private int code;
	private String name,address;
	Department dept;
	Library lib;
	
	public void setDept(Department dept) {
		this.dept = dept;
	}
	public Department getDept()
	{
		return dept;
	}
	public void setLib(Library lib) {
		this.lib = lib;
	}
	public Library getlib()
	{
		return lib;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String toString()
	{
		return "Code :"+code+"\nName: "+name+"\nAddress:"+address+"\nDepartment\n"+dept+"\nLibrary\n"+lib;
	}
	
	
	
	
}
