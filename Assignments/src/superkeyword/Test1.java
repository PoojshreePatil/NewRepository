package superkeyword;

  class Test {
     int a = 5;
      void testMethod()
      {
    	  System.out.println("This is Parent Class Method");
      }
	
	 Test()
	 {
		 System.out.println("Parent Class Constructor");
	  }

}
  class Test2 extends Test
  {
	 int b = 6;
	 void testMethod2()
	 {
	  System.out.println( super.a);
	  System.out.println(b);
	 }
	  Test2()
	  {
		  super();
		  super.testMethod();
	  }
	  
  }



class Test1{
	
	public static void main(String[] args) {
		
		Test2 t1 = new Test2();
	     t1.testMethod2();
	}
}