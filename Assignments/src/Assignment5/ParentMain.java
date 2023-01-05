package Assignment5;

     class Parent
    {
    	// private  void display()
	   void display()
	   {
		   System.out.println("This is Parent Class");
	   }
    	 
    }
     class Child extends Parent
     {
    	 void view()
    	 {
    		 System.out.println("This is Child Class");
    	 }
     }
public class ParentMain {

	public static void main(String[] args) {

		Parent p = new Parent();
		p.display();
		
		Child c = new Child();
		c.view();
		
		c.display();
	}

}
