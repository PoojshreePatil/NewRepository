package ComparatorHashMap;

import java.util.ArrayList;

public class Employee implements Comparable<Employee>
  {
    int id;
    String name;
    Profile p;
	public Employee(int id, String name, Profile p)
	{
		this.id = id;
		this.name = name;
		this.p = p;
	}
	public String toString() {
		return " Employee id=" + id + ", name=" + name + "  Profile-"+ p;
	}
	@Override
	public int compareTo(Employee e) {
		
	if(this.name.compareTo(e.name) == 0)
	{
		if(this.id > e.id)
		     return 1;
		else if(this.id < e.id)
			 return -1;
		else
			return 0;
	} 
	else
		return (this.name.compareTo(e.name));
  }
  }
