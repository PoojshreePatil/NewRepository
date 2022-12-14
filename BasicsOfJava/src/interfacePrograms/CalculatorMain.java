package interfacePrograms;

  interface Calculator
   {
	  void addition(int a,int b);
	  void multiplication(int a,int b);
	  void division(int a,int b);
	  void substraction(int a,int b);
	 
   }
 class SciCalculator implements Calculator
 {
     public void square(int a)
     {
    	 System.out.println("Square:"+(a*a));
     }
	 
     public void sqrt(int a)
     {
    	 System.out.println("Square root:"+Math.sqrt(a));
     }
     public void power(int a,int b)
     {
    	 System.out.println("Power of number:"+Math.pow(a, b));
     }
	@Override
	
	  public void addition(int a, int b) 
	  {
		System.out.println("Addition :"+(a+b));
	  }
	 

	@Override
	public void multiplication(int a, int b) {
		System.out.println("Multiplication :"+(a*b));			
	}

	@Override
	public void division(int a, int b) {
		System.out.println("Division :"+(a / b));	
		
	}

	@Override
	public void substraction(int a, int b) {
		System.out.println("Substraction :"+(a-b));			
	}
	 
 }

public class CalculatorMain {

	public static void main(String[] args) {

		SciCalculator sc = new SciCalculator();
		sc.addition(5,10);
		sc.multiplication(4,5);
		sc.division(8, 2);
		sc.substraction(20,8);
	}

}
