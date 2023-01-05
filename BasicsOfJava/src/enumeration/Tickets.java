package enumeration;

public enum Tickets {

	SILVER(150)
	{
		public String toString()
		{
			return "Silver Category Rate is Rs. 150/-";
		}
	},
	GOLDEN(200)
	{
		public String toString()
		{
			return "Golden Category Rate is Rs. 150/-";
		}
	},
	PLATINUM(250)
	{
		public String toString()
		{
			return "Paltinum Category Rate is Rs. 150/-";
		}
	};
	int rate;
	private Tickets(int rate)
	{
		this.rate = rate;
	}
	
	//public static final Tickets  Silver = new Tickets(150);
	
}
