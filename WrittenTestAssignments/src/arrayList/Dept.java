package arrayList;

public class Dept {

	String dname;

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	/*
	 * public Dept(String dname) {
	 * 
	 * this.dname = dname; }
	 */
	@Override
	public String toString() {
		return "Department name=" + dname;
	}
	
	
}
