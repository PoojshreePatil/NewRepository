package com.pojo;

public class Employee1 {

  public int id,salary;
	public String name,dept,email;
	public Employee1(int id, int salary, String name, String dept, String email) {
		
		this.id = id;
		this.salary = salary;
		this.name = name;
		this.dept = dept;
		this.email = email;
	}
	@Override
	public String toString() {
	 return "Employee1 id=" + id + ", salary=" + salary + ", name=" + name + ", dept=" + dept + ", email=" + email;
	}
	
}
