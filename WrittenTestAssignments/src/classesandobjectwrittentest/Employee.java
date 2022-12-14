package classesandobjectwrittentest;

public class Employee {

	int id,salary;
	String name,dept;
	void setdata(int i,String n,int s,String d)
	{
		id = i;
		name = n;
		salary = s;
		dept = d;
	}
	void display()
	{
		System.out.println("Employee Details: ");
		//System.out.println(id +" "+name+" "+salary+" "+dept+" ");
	
		
	}
	  public String toString()
	  {
		  return id +" "+name+" "+salary+" "+dept+" "; 
	  }
	 
	public static void main(String[] args) {

     Employee e = new Employee();
     e.setdata(1, "Poojshree", 50000, "computer");
       System.out.println(e);
	}

}
