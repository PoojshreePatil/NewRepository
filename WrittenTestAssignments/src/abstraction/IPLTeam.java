package abstraction;

public class IPLTeam {

	private String teamnm,statenm;
	private static int playerno = 11;
	
	public String getTeamnm() {
		return teamnm;
	}
	public void setTeamnm(String teamnm) {
		this.teamnm = teamnm;
	}
	public String getStatenm() {
		return statenm;
	}
	public void setStatenm(String statenm) {
		this.statenm = statenm;
	}
	
	void play()
	{
		System.out.println("***********IPLTeam Info ****************");
		System.out.println("Teams Playing good ");
		System.out.println("Team Name:"+teamnm+"\nState Name:"+statenm);
		
	}
	
}
