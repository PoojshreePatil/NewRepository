package wrapperClasses;

public class MethodMain {


		void display(int a)
		{
			System.out.println("int");
		}
		void display(Integer a)
		{
			System.out.println("Integer");
		}
		void display(float a)
		{
			System.out.println("float");
		}
		void display(Float a)
		{
			System.out.println("Float class");
		}
		void display(Number a)
		{
			System.out.println("Number class");
		}
		
		
		public static void main(String[] args) {
			
			MethodMain  m = new MethodMain();
			m.display(10.2f);
			
			Integer i = (int) 34.7895;
			System.out.println(i);
		}
	}


