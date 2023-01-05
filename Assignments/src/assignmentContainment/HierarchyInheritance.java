package assignmentContainment;


  class Institute
  {
	int id;
	String name ;
	Branch b;
	
	public Institute(int id, String name, Branch b) {
		
		this.id = id;
		this.name = name;
		this.b = b;
	}
	public String toString()
	{
		return "Institute Info: "+"\nInstitute Id: "+id+"\nInstitute Name: "+name+"\n*************"+"\nBranch Info : "+b;
	}
	

  }
	
	class Branch
	  {
		int id;
		String name ;
		Subject s;
		public Branch(int id, String name, Subject s) {
			
			this.id = id;
			this.name = name;
			this.s = s;
		}
	
		public String toString() {
			return "\nBranch id: " + id + "\nBranch name: " + name + "\n*************"+"\nSubject Info: " + s ;
		}
		
	   }
	class Subject
	  {
		int id;
		String name ;
		Topic t;
		public Subject(int id, String name, Topic t) {
		
			this.id = id;
			this.name = name;
			this.t = t;
		}
		public String toString() {
			return "\nSubject id: " + id + "\nSubject name: " + name +"\n*************"+ "\nTopic Info: " + t ;
		}
		
	  }
	class Topic
	 {
		int id;
		String name ;
		SubTopic st;
		public Topic(int id, String name, SubTopic st) {
			
			this.id = id;
			this.name = name;
			this.st = st;
		}
		public String toString() {
			return "\nTopic id: " + id + "\nTopic name: " + name +"\n*************"+ "\nSubTopic Info: " + st ;
		}
	 
	 }
	class SubTopic
	{
		int id;
		String name ;
		Question q;
		public SubTopic(int id, String name, Question q) {
			
			this.id = id;
			this.name = name;
			this.q = q;
		}
		public String toString() {
			return "\nSubTopic id: " + id + "\nSubTopic name: " + name +"\n*************"+ "\nQuestion Info: " + q ;
		}
	 
		
	}
	class Question
	{
		int id;
		String name ;
		public Question(int id, String name) {
			
			this.id = id;
			this.name = name;
		}
		public String toString() {
			return "\nQuestion id: " + id + "\nQuestion name: " + name ;
		}
		
	}
	public class HierarchyInheritance 
	{
	  public static void main(String[] args) {
          
		  Question q1 = new Question(1,"question") ;
		  SubTopic st1 = new SubTopic(2,"subtopic",q1);
		  Topic t1 = new Topic(3,"topic",st1);
		  Subject s1 = new Subject(4,"subject",t1);
		  Branch b1 = new Branch(5,"branch",s1);
		  Institute i = new Institute(6,"institute",b1);
		  
		  System.out.println(i);
		
	}

}
