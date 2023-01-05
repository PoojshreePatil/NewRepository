package assignment4;

public class Q13 {
/*13.Create a class to print an integer and a character with two methods having 
the same name but different sequence of the integer and the character 
parameters.For example, if the parameters of the first method are of the 
form (int n, char c), then that of the second method will be of the form 
(char c, int n).
 */
	
	void print(int n,char c)
	{
		System.out.println("This is First Method");
		System.out.println("integer:" +n);
		System.out.println("character:"+c);
	}
	
	void print(char c, int n)
	{
		System.out.println("This is Second Method");
		System.out.println("character:"+c);
		System.out.println("integer:" +n);
	}
	
	public static void main(String[] args) {

		Q13 q = new Q13();
		q.print(1, 'P');
		q.print('S', 10);
	}

}
