package Assignment5;

//11.What will be the output of the following program?
     class A
     {
	     String s = "Class A";
      }

     class B extends A
     {
	      String s = "Class B";

     	public B()
     	{
		    System.out.println(super.s);
	    }
     }

     class C extends B
     {
	     String s = "Class C";

	  public C() 
	  {
		System.out.println(super.s);
	  }
     }

    public class classMain
     {
	    public static void main(String[] args) 
	    {
		  C c = new C();
		  System.out.println(c.s);
	    }
     }