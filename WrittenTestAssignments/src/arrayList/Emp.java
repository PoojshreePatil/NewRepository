package arrayList;

public class Emp {

	int id,eno;
    String name;
    Dept d;
    
	    public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Dept getD() {
		return d;
	}
	public void setD(Dept d) {
		this.d = d;
	}
		
	    
		/*
		 * Emp(int id,int eno, String name , Dept d) { this.id = id; this.eno = eno;
		 * this.name = name; this.d = d; }
		 */
		@Override
		public String toString() {
			return "Emp id=" + id + ", eno=" + eno + ", name=" + name + ", Depatment:" + d.dname ;
		}
	

}
