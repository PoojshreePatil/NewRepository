package ComparatorHashMap;

import java.util.Comparator;

public class EmployeeSortOnCountry implements Comparator<Employee> {

	public int compare(Employee e1, Employee e2) {
		
		return (e1.p.country.compareTo(e2.p.country));
	}

}
