package enumeration;

 interface SeasonDetails {


	void discription();
}
public enum Seasons implements  SeasonDetails
{
	Rainy
	{
	public void discription()
	{
		System.out.println("Rainy Season");
	}
   },
	Winter
	{
	   public void discription()
		{
			System.out.println("Winter Season");
		}
	},
	Summer
	{
	   public void discription()
		{
			System.out.println("Summer Season");
		}
	};
}
