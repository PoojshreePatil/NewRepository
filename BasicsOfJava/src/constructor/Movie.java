package constructor;

import java.util.Scanner;

public class Movie {

	int id,releaseyear,budget;
	String name,producer;
	Movie(int id,String name,int releaseyear,String producer,int budget)
	{
		this. id = id;
		this.name = name;
		this.releaseyear = releaseyear;
		this.producer = producer;
		this.budget = budget;
		
	}
	 void display()
	 {
		 System.out.println(id+" "+name+" "+releaseyear+" "+producer+" "+budget+"  crore");
	 }
	public static void main(String[] args) {

		for(int i =1 ; i<=3 ;i++)
		{
			
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the id :");
		int id = sc.nextInt();
		System.out.println("Enter the movie name:");
		String name = sc.next();
		System.out.println("Enter the movies release year:");
		int releaseyear = sc.nextInt();
		System.out.println("Enter the producer name:");
		String producer = sc.next();
		System.out.println("Enter the budget:");
		int budget = sc.nextInt();
		Movie m = new Movie(id,name,releaseyear,producer,budget);
		m.display();

		}
	}

}
