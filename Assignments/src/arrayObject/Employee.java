package arrayObject;

public class Employee {

	int id,salary;
	String name;
    Date d;
    Department dept;
	
	public void setId(int id) {
		this.id = id;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setD(Date d) {
		this.d = d;
	}

	public int getId() {
		return id;
	}

	public int getSalary() {
		return salary;
	}

	public String getName() {
		return name;
	}

	public Date getD() {
		return d;
	}

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

	/*
	 * public Employee(int id, String name,int salary, Date d) {
	 * 
	 * this.id = id; this.salary = salary; this.name = name; this.d = d; }
	 *  */
	  public String toString() 
	  {
		  return  "Id:"+id+"\nName:"+name+"\nSalary:"+salary+"\ndate:"+d+"\nDepartment :"+dept; 
	  }
	
}
