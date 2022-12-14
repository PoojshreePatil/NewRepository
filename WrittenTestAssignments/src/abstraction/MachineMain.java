package abstraction;

	abstract class Machine
	{
		 abstract void crush();
		 void rotate()
		 {
			 System.out.println("Concrete Method Rotate");
		 }
	}
	class Juicer extends Machine
	{

		@Override
		void crush() {
            System.out.println("Overrided Abstract Method of Abst class");			
		}
		
		 void filter()
		 {
			 System.out.println(" Simple Method of Child class Juicer");
		 }
	}
	public class MachineMain 
	{
	   public static void main(String[] args) {

			
		  Juicer j = new Juicer(); 
		  j.crush();
		  j.rotate(); 
		  j.filter();
			  
		   Machine m = new Juicer();
		   m.crush();
		   m.rotate();
		   
		   
		   
		   
		   
		   
	//	   m.filter();
		   
	}

}
