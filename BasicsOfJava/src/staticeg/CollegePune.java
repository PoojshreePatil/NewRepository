package staticeg;

import java.util.Scanner;

public class CollegePune {

	int id,dno,studno;
	String name,location;
	static String uniname ="Pune university";
	static String state = "Maharashtra";
	
	CollegePune(int i,int d,int s,String n,String l)
	{
		id = i;
		dno = d;
		studno = s;
		name = n;
		location = l;
	//	this.uniname = uniname;
		//this.state = state;
		
	}
	void show()
	{
		System.out.println("id: "+id+"\ndno: "+dno+"\nstudno: "+studno+"\nname: "+name+"\nlocation: "+location+"\nuniname: "+uniname+"\nstate: "+state);
	}
	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		System.out.println("Enter id ,dno,studno,name,location");
		int id = sc.nextInt();
		int dno = sc.nextInt();
		int studno = sc.nextInt();
		String name = sc.next();
		String location = sc.next();
		
		CollegePune c = new CollegePune(id,dno,studno,name,location);
		c.show();
	}

}
