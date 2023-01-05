package InheritanceUsingAbstractClassExamples;

abstract class Abs1
    {

    	void doAbs1() 
	    {
	    	System.out.println("simple Method Of Abstract 1 class");
	    }

	     /*
	         * void method() { System.out.println("method"); }
	      */
   }

   abstract class Abs2 extends Abs1
   {

	void doAbs2() 
	  {
		   System.out.println("simple Method Of Abstract 2 class");
	  }

 }

class temp extends Abs1 , Abs2
     {
    	 
     }
   public  class Abstract {

	   public static void main(String[] args) {

}
}