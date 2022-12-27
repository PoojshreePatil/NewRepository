package com.test;

import com.dao.EmployeeOperation;

public class EmployeeMain {

	public static void main(String[] args) {

		EmployeeOperation eo = new EmployeeOperation();
		
		eo.mainArray();
		eo.display();
		eo.search();
	}

}
