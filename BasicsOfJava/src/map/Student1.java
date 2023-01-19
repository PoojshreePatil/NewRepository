package map;

public class Student1 
  {
     int id;
     String name,dept;
     int marks;
	public Student1(int id, String name, String dept, int marks) {
		
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.marks = marks;
	}
	
	public String toString() {
		return "\nStudent1 [id=" + id + ", name=" + name + ", dept=" + dept + ", marks=" + marks + "]";
	}
	public int hashCode()
	{
		return id;
		
	}
     public boolean equals(Object o)
     {
    	 Student1 s= (Student1) o;
    	 if(this.id == s.id)
    	 {  
    		// this.name.equals(s.name);
    		 this.dept.equals(s.dept);
	     	    return true;
    	 }
    	 else
    		 return false;
    	 
     }
 }
