package enumeration;

public class WeekOfDaysMain {

	public static void main(String[] args) {

		WeekOfDays w[] = WeekOfDays.values();
		//System.out.println(w);
        Seasons s[] = Seasons.values();
		
		for(WeekOfDays wod : w)
		{
			System.out.println(wod);
			
		}
	}

}
