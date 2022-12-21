package exception;

public class SimpleException {

	
		void add(int a,int b)
		{
			System.out.println("Addition:"+(a+b));
		}
		void sub(int a,int b)
		{
			System.out.println("Substraction:"+(a-b));
		}
		void multi(int a,int b)
		{
			System.out.println("Multiplication:"+(a*b));
		}
		void divi(int a,int b)
		{
			System.out.println("Division:"+(a/b));
		}
		
		public static void main(String[] args) {
			
			int a = 105,b =0;
			SimpleException se = new SimpleException();
			
			se.add(a, b);
			try
			{
			     se.divi(a, b);
			}
			catch(ArithmeticException e)
			{
				System.out.println(e);
			//	e.printStackTrace();
			}
			se.sub(a, b);
			se.multi(a, b);
			

	}

}
