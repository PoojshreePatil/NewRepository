package arrayObject;

import java.util.Scanner;

public class TheaterMovieMain {

	public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
	
		Theater thtr[] = new Theater[1];
		for(int i = 0;i< thtr.length;i++)
		{
			Movie[] m= new Movie[2] ;
		    System.out.println("Enter Theater id,name:");
		    int tid =sc.nextInt();
			String tname = sc.next();
			 
			 for(int j = 0;j< m.length;j++)
			 {
				 
				 System.out.println("Enter the Movie id,Name,releaseyear:");
				 int mid =sc.nextInt();
				 String mnm = sc.next();
				 int mreleaseyear = sc.nextInt();
				 
		         m[j]= new Movie(mid,mnm,mreleaseyear);
             }
			 
			 thtr[i] = new Theater(tid,tname,m);
         }
		
		for(Theater t : thtr)
		{
			for( Movie m1 : t.m)
			{
			   if(m1.releaseyear == 2020)
		     	{
			       System.out.println(m1);
		        }
		    }
		}
}
}