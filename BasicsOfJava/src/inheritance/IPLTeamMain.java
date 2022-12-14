package inheritance;

public class IPLTeamMain {

	public static void main(String[] args) {

		MI m = new MI();
		m.setTeamnm("Mumbai Indians");
		m.setStatenm("Maharashtra");
		m.setCaptainnm("Rohit Sharma");
		m.setWoncupno(5);
		m.play();
		
		CSK c = new CSK();
		c.setTeamnm("Chennai Super Kings");
		c.setStatenm("TamilNadu");
		c.setCaptainnm("M S Dhoni");
		c.setWoncupno(4);
		c.play();
		
	}

}
