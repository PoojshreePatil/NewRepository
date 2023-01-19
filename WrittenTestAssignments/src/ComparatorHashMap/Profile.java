package ComparatorHashMap;

public class Profile //implements Comparable<Employee>
  {
    String state,country;

	public Profile(String state, String country) {
		
		this.state = state;
		this.country = country;
	}

	@Override
	public String toString() {
		return " state=" + state + ", country=" + country ;
	}

	/*@Override
	public int compareTo(Employee e) {
		
		return (this.country.compareTo(e.p.country));
	}
    */
  }
