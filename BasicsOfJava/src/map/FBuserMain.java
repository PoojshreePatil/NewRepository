package map;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class FBuserMain {

	void setData(HashMap<FBuser, Integer> hm)
	{
		hm.put(new FBuser(1,"Poojshree","poojshree@gmzail.com","Female","87668","988965476"), 20);
		hm.put(new FBuser(671,"Pooja","pooja@gmzail.com","Female","12878","9876895476"), 21);
		hm.put(new FBuser(2001,"shree","shree@gmzail.com","Male","87668","988965476"), 22);
		hm.put(new FBuser(156,"Nivedita","nivedita@gmzail.com","Female","87668","988965476"), 21);
		hm.put(new FBuser(40,"Yashraj","yashraj@gmzail.com","Male","87668","988965476"), 18);
		hm.put(new FBuser(40,"Yash","yashraj@gmzail.com","Male","87668","988965476"), 48);
	}
	public static void main(String[] args) {

		LinkedHashMap<FBuser, Integer> hm = new LinkedHashMap();
		FBuserMain fm = new FBuserMain();
	//	hm.put(new FBuser(40,"Yash","yashraj@gmzail.com","Male","87668","988965476"), 48);
		fm.setData(hm);
		System.out.println(hm);
		
	}

}
