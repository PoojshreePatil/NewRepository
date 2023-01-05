package enumeration;

public enum WeekOfDays {

	Sunday
	{
		public String toString()
		{
			return "It is Funday";
		}
	},
	Monday
	{
		public String toString()
		{
			return "It IS Blue Day";
		}
	},
	Tuesday
	{
		public String toString()
		{
			return "It is Electricity gone day";
		}
	},
	Wednesday
	{
		public String toString()
		{
			return "It is normal day";
		}
	},
	Thursday
	{
		public String toString()
		{
			return "It is nice day";
		}
	},
	Friday
	{
		public String toString()
		{
			return "It is good day";
		}
		
	},
	Saturday
	{
		public String toString()
		{
			return "It is holiday";
		}
	};

	
	private WeekOfDays()
	{
		
	}
}
