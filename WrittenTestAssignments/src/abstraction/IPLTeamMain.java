package abstraction;

public class IPLTeamMain {

	public static void main(String[] args) {

		RCB r = new RCB();
		r.setTeamnm("Royal Challengers Benglore");
		r.setStatenm("Karnataka");
	//	r.setCaptainnm("Virat Kohali");
	//	r.setWoncupno(0);
		r.play();
		
		CSK c = new CSK();
		c.setTeamnm("Chennai Super Kings");
		c.setStatenm("TamilNadu");
	//	c.setCaptainnm("M S Dhoni");
	//	c.setWoncupno(4);
		c.play();
		
	}

}
