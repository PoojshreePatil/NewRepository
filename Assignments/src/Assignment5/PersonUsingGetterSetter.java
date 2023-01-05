package Assignment5;

   class Person1
   {
	   private int id;
	   String name;
	   Job1 j;
	   
	   public void setId(int id)
	   {
		   this.id = id;
	   }
	   public int getId()
	   {
		   return id;
	   }
	   public void setName(String name)
	   {
		   this.name = name;
	   }
	   public String getName()
	   {
		   return name;
	   }
   
   public String toString()
	{
		return "Person Info: "+"\nId: "+id+"\nName: "+name+"\nJob Info "+j;
	}
   }
   
   class Job1
   {	
	    int jobid;
	    String profile;
	    JoiningDate1 jd;
	    
	    public int getJobid() {
			return jobid;
		}
		public void setJobid(int jobid) {
			this.jobid = jobid;
		}
		public String getProfile() {
			return profile;
		}
		public void setProfile(String profile) {
			this.profile = profile;
		}

		public JoiningDate1 getJd() {
			return jd;
		}
		public void setJd(JoiningDate1 jd) {
			this.jd = jd;
		}

      public String toString()
	  {
		   return "\nJobId: "+jobid+"\nProfile: "+profile+"\nJoining Date Info "+jd;
	  }
   }
   
   class JoiningDate1
	{
		int day,month,year;
		
        public int getDay() 
        {
			return day;
		}

		public void setDay(int day) {
			this.day = day;
		}

		public int getMonth() {
			return month;
		}

		public void setMonth(int month) {
			this.month = month;
		}

		public int getYear() {
			return year;
		}

		public void setYear(int year) {
			this.year = year;
		}
		
		 public String toString()
			{
				return "\nDay: "+day+"\nMonth: "+month+"\nYear:"+year;
			}
	}

public class PersonUsingGetterSetter {

	public static void main(String[] args) {
		JoiningDate jd = new JoiningDate(1,2,2024);
		Job j = new Job(101,"Manager",jd);
		Person p = new Person(1,"Poojshree",j);
		System.out.println(p);

	}

}
