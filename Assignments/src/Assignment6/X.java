package Assignment6;

	interface X
	{
	 void methodX();
	}
	class Y implements X
	{
	 public void methodX()
	 {
	 System.out.println("Method X");
	 }
	}
	
	class Main1
	{
		public static void main(String[] args) {
			
			Y y = new Y();
			y.methodX();
		}
	}

