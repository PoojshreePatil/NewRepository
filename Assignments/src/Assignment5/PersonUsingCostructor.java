package Assignment5;

 class Person
   {
	 int id;
	 String name;
	 Job j;
	 public Person(int id, String name, Job j)
	 {
	
		this.id = id;
		this.name = name;
		this.j = j;
	 }
	 
	 public String toString()
		{
			return "Person Info: "+"\nId: "+id+"\nName: "+name+"\nJob Info "+j;
		}
		
	}
	 
	class Job 
	{
		int jobid;
		String profile;
		JoiningDate jd;
		public Job(int jobid, String profile, JoiningDate jd) 
		{
			//super(1,"Poojshree",j);
			this.jobid = jobid;
			this.profile = profile;
			this.jd = jd;
	    }
		
		 public String toString()
			{
				return "\nJobId: "+jobid+"\nProfile: "+profile+"\nJoining Date Info "+jd;
			}
		 
		 
		/*
		 * void display() {
		 * 
		 * // System.out.println("Person Information");
		 * System.out.println("Job Id:"+jobid+"\nProfile:"+
		 * profile+"\nJoining Date  Details"); }
		 */
	}
	
	class JoiningDate
	{
		int day,month,year;

		public JoiningDate(int day, int month, int year) 
		{
			//super(101,"Manager",jd);
			this.day = day;
			this.month = month;
			this.year = year;
		}
		/*
		 * void display() { // System.out.println("Person Information");
		 * System.out.println("Day :"+day+"\nMonth:"+month+"\nYear:"+
		 * year+"\nJob Details"); }
		 */	
		 public String toString()
			{
				return "\nDay: "+day+"\nMonth: "+month+"\nYear:"+year;
			}
	}
 
public class PersonUsingCostructor {

	public static void main(String[] args) {

		JoiningDate jd = new JoiningDate(1,2,2024);
		Job j = new Job(101,"Manager",jd);
		Person p = new Person(1,"Poojshree",j);
		System.out.println(p);
	
	}

}
