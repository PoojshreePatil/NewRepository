package whilelooping;

public class EvenNumberExamle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int i=1;
     
       System.out.println("Even Number:");
       while(i<=10)
       {
    	  if(i % 2 == 0)
    	  {
    	   System.out.println(i);
    	  }
    	  i++; 
   	  }
       System.out.println("Done");
}
}