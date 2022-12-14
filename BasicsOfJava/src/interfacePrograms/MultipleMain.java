package interfacePrograms;

	interface A
	{
	   void add(int a,int b);
	   void multiply(int a,int b);
	   void sqrt(int a);
	}
	interface B
	{
		void square (int a);
		void sqrt(int a);
	}
// abstract class ABC implements A,B {
	class ABC {
	public void add(int a,int b)
	{
		System.out.println("Addition:"+(a+b));
	}
	public void sqrt(int a)
	{
		System.out.println("Square root:"+ Math.sqrt(a));
	}

	/*
	 * public void square(int a) { System.out.println("Square:"+(a*a)); }
	 */
	 class DEF extends ABC implements A,B
	{
		
		@Override
		public void square(int a) {

			System.out.println("Square:"+(a*a));
		}


		@Override
		public void multiply(int a, int b) {
			
			System.out.println("Multiplication:"+(a*b)); 
		}
		
	}
}	
	class MultipleMain 
	{
	public static void main(String[] args) {

		ABC a = new ABC();
		//DEF a = new DEF();
		a.add(5, 10);
		a.sqrt(25);
	//	a.square(4);
	}

}
